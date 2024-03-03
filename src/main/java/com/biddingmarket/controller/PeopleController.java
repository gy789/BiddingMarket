package com.biddingmarket.controller;

import com.biddingmarket.entity.People;
import com.biddingmarket.entity.Users;
import com.biddingmarket.service.PeopleService;
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
public class PeopleController {

    @Autowired(required = false)
    private PeopleService peopleService;

    @RequestMapping("/addPeople")
    public String AddPeople(HttpServletRequest request, People people,Model model){
        HttpSession session = request.getSession();
        Users users = (Users)session.getAttribute("user");
        people.setUid(users.getUid());
        int flag = peopleService.addPeople(people);
        if (flag > 0){
            return "redirect:/peoplelist";
        }
        model.addAttribute("error","添加失败");
        return "/biddingmarket/addpeople";
    }

    @RequestMapping("/delpeople")
    @ResponseBody
    public Msg DelPeople(@RequestParam("people_id")String param){
        int people_id = Integer.parseInt(param);
        int flag = peopleService.delPeople(people_id);
        if (flag > 0){
            return Msg.success("成功");
        }
        return Msg.fail("失败");
    }

    @RequestMapping("/peoplelist")
    public String getPeopleList(Model model,HttpServletRequest request){
        HttpSession session = request.getSession();
        Users user = (Users)session.getAttribute("user");

        List<People> peopleList = peopleService.getPeopleList(user.getUid());
        model.addAttribute("peopleList",peopleList);
        return "biddingmarket/allpeople";
    }

    @RequestMapping("/uppeople")
    public String UpdatePeople(Model model,People people){
        int flag = peopleService.updatePeoplieInfo(people);
        if(flag > 0){
            return "redirect:/peoplelist";
        }
        model.addAttribute("error","修改失败");
        return "/biddingmarket/peopleinfo";
    }

    @RequestMapping("/skippeopleinfo")
    public String getFlightInfo(Model model, @RequestParam("people_id")String param){

        People people = peopleService.getPeopleInfo(Integer.parseInt(param));

        if (people == null){
            model.addAttribute("error","系统异常");
            return "/biddingmarket/allpeople";
        }
        model.addAttribute("people",people);
        return "/biddingmarket/peopleinfo";
    }

}
