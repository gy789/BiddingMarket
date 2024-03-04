package com.biddingmarket.controller;

import com.biddingmarket.entity.Users;
import com.biddingmarket.service.UserService;
import com.biddingmarket.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired(required = false)
    private UserService userService;


    @RequestMapping("/login")
    public String Login(Users u, Model model, HttpServletRequest request){
        Users user = userService.login(u.getUsername(),u.getPassword());
        if(user == null){
            model.addAttribute("errorMsg","用户名或密码错误");
            return "/biddingmarket/Login";
        }else {
            HttpSession session = request.getSession();

            session.setAttribute("user", user);

            return "redirect:/index";
        }
    }

    @RequestMapping("/register")
    public String register(Users user, Model model, HttpServletRequest request) throws Exception{
        user.setRole("2");
        if (user.getPassword().equals("")){
            model.addAttribute("errorMsg","密码为空，请输入密码");
            return "/biddingmarket/Register";
        }
        try {
            userService.register(user);
            return "/biddingmarket/Login";
        }catch (Exception e){
            model.addAttribute("errorMsg","注册失败(用户名重复)");
            return "/biddingmarket/Register";
        }
    }

    @RequestMapping("/userlist")
    public String getUserList(Model model){
        List<Users> usersList = userService.getAllUsers();
        model.addAttribute("userlist",usersList);
        return "biddingmarket/allusers";
    }


    @RequestMapping("/deleteuser")
    @ResponseBody
    public Msg deleteuser(@RequestParam("uid")String uid){
        int flag = userService.deleteUsers(Integer.parseInt(uid));
        if(flag > 0){
            return Msg.success("删除成功");
        }else {
            return Msg.fail("删除失败");
        }
    }

    @RequestMapping("/UnBoundUser")
    public String UnBoundUser(Model model){

        List<Users> usersList = userService.getUnBoundUser();
        model.addAttribute("userlist",usersList);
        return "biddingmarket/unbounduser";
    }

    /*@RequestMapping("/getusers")
    public String getusers(@RequestParam("uid")String uid,@RequestParam("type")String type, Model model){
        if (type.equals("1")) {
            Users users = userService.getUsers(Integer.parseInt(uid));
            if (users == null) {
                model.addAttribute("error", "系统异常");
                return "/biddingmarket/allusers";
            }
            model.addAttribute("users", users);
            return "/biddingmarket/userdetails";
        }
        else if (type.equals("2")){
            Users users = userService.getUsers(Integer.parseInt(uid));
            if (users == null){
                model.addAttribute("error", "系统异常");
                return "/biddingmarket/unbounduser";
            }
            List<Company> companies = companyService.getAllCompany();
            model.addAttribute("companylist",companies);
            model.addAttribute("users", users);
            return "/biddingmarket/binduser";
        }else {
            return "/biddingmarket/404";
        }

    }*/

    @RequestMapping("/myinfo")
    public String MyInfo(Model model,HttpServletRequest request){
        HttpSession session = request.getSession();
        Users users = (Users)session.getAttribute("user");
        Users u = userService.getUsers(users.getUid());
        model.addAttribute("users",u);
        return "/biddingmarket/userdetails";
    }

    @RequestMapping("/adduser")
    public String adduser(Users u, Model model, HttpServletRequest request){
        int flag = userService.addUser(u);
        if(flag == 0){
            model.addAttribute("error","添加失败");
            return "/abiddingmarket/addusr";
        }else {
            return "redirect:userlist";
        }
    }

    @RequestMapping("/updateuser")
    public String updateuser(Users u, Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        Users user = (Users)session.getAttribute("user");
        try {
            if (u.getRole().equals("") && u.getRole() == null){

                u.setRole(user.getRole());
            }

        }catch (Exception e){
            u.setRole(user.getRole());
        }
        int flag = userService.updateUser(u);
        if (user.getRole().equals("0")) {
            if (flag == 0) {
                model.addAttribute("error", "修改失败");
                return "/biddingmarket/userdetails";
            } else {
                return "redirect:/userlist";
            }
        }else {
            if (flag == 0) {
                model.addAttribute("error", "修改失败");
                return "/biddingmarket/userdetails";
            } else {
                return "redirect:myinfo";
            }
        }

    }

}
