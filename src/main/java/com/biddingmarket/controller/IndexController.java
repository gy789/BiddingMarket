package com.biddingmarket.controller;

import com.biddingmarket.entity.Users;
import com.biddingmarket.service.MenuService;
import com.biddingmarket.utils.CreateMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired(required = false)
    private MenuService menuService;


    @RequestMapping("/index")
    public String GetIndex(Model model,HttpServletRequest request){
        HttpSession session = request.getSession();
        Users user = (Users)session.getAttribute("user");

        try {
            CreateMenu cm = new CreateMenu(user.getRole(),menuService);
            model.addAttribute("menu",cm.printMenu());

            return "/biddingmarket/index";
        }catch (Exception e){
            return "biddingmarket/Login";
        }

    }

}
