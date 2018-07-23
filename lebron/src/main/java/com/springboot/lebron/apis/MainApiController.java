package com.springboot.lebron.apis;

import com.springboot.lebron.managersAndInterfaces.HibernateManager;
import com.springboot.lebron.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/api")
public class MainApiController {

    @Autowired
    public HibernateManager manager;
    //returns true if the email and password match
    // http://localhost:8080/api/login?email=bseager21@gmail.com&password=admin
    @GetMapping(path="/login")
    public @ResponseBody
    String loginApiController(@RequestParam String email, @RequestParam String password) {
        User user = manager.getUserRepository().findByEmail(email);
        if(user == null){
            return "false";
        }
        if(user.getPassword().equals(password)){
            return "true";
        }
        else{
            return "false";
        }
    }
}