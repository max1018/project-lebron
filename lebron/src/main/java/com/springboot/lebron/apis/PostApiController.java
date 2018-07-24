package com.springboot.lebron.apis;

import com.springboot.lebron.managersAndInterfaces.HibernateManager;
import com.springboot.lebron.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping(path="/api/posts")
public class PostApiController {

    @Autowired
    public HibernateManager manager;

    //returns all posts
    //we should probably never ever use this one
    @GetMapping(path="/getall")
    public @ResponseBody List<Post> getAllPosts() {
        List<Post> listOfPosts = (List<Post>) manager.getPostRepository().findAll();
        return listOfPosts;
    }

    //returns a list of posts by userID
    @GetMapping(path="/get")
    public @ResponseBody List<Post> getPostByUserId(@RequestParam Integer userId) {
        List<Post> listOfPosts = manager.getPostRepository().findByUserId(userId);
        return listOfPosts;
    }
}
