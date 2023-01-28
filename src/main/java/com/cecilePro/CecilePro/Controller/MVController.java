package com.cecilePro.CecilePro.Controller;

import com.cecilePro.CecilePro.Entities.Article;
import com.cecilePro.CecilePro.Entities.User;
import com.cecilePro.CecilePro.Repositories.ArticleRepository;
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

    @Autowired
    private ArticleRepository articles;

    @GetMapping("/mainPage")
    public List<Article> fetchArticles(){
        return articles.findAll();
    }

}
