package com.wx.controller;

import com.wx.bean.User;
import com.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

   @RequestMapping("/list")
    public String getUserList(Model model){
        List<User> userList = userService.getUserList();
        model.addAttribute("userList",userList);
        return "list";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id,Model model){
       User user = userService.getUser(id);
       model.addAttribute("user",user);
       return "update";
    }

    @GetMapping("/update")
    public String update(User user){
        userService.updateUser(user);
        return "redirect:/list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
       return "add";
    }


    @GetMapping("/addUser")
    public String addUser(User user){
       userService.addUser(user);
       return "redirect:/list";
    }

    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return "redirect:/list";
    }
}
