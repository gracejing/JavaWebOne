package com.jingda.controller;

import com.jingda.model.UserBean;
import com.jingda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
    UserRepository userRepository;

    //实现register功能
//    @PostMapping("/user/handleRegister")
    @RequestMapping(value = "/handleRegister",method = RequestMethod.GET)
    public String handleRegister(UserBean user, ModelAndView modelAndView){
        System.out.println(user.getName()+"lalllal"+user.getPassword());
        //userRepository.save(user);//UserRepository自带简单的sql语句，即insert into...
        System.out.println(user.getName()+"mmmmmm"+user.getPassword());

        return "login";
    }

    //实现login功能
    @PostMapping("/handleLogin")
    public String handleLogin(@RequestParam("name")String name,
                              @RequestParam("password")String password,
                            HttpSession session, Map<String,Object> map) {
        UserBean user = userRepository.findByUsernameAndPassword(name, password);
        if (user != null) {
            session.setAttribute("name", user.getName());
            return "redirect:/main.html";//redirect重定向
        } else {
            //向页面输出的内容
            map.put("msg", "用户名或密码错误");
            return "login";
        }
    }
}
