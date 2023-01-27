package com.cecilePro.CecilePro.Controller;

import com.cecilePro.CecilePro.Entities.User;
import com.cecilePro.CecilePro.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class MVController {
    @Autowired
    private UserRepository users;
    @GetMapping("/allusers")
    public List<User> fetchUsers(){
        return users.findAll();
    }

}
