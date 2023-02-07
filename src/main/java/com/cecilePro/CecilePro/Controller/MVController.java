package com.cecilePro.CecilePro.Controller;

import com.cecilePro.CecilePro.Entities.Article;
import com.cecilePro.CecilePro.Entities.SocialNetwork;
import com.cecilePro.CecilePro.Entities.User;
import com.cecilePro.CecilePro.Repositories.ArticleRepository;
import com.cecilePro.CecilePro.Repositories.SocialNetworkRepository;
import com.cecilePro.CecilePro.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class MVController {
    @Autowired
    private UserRepository users;

    @Autowired
    private ArticleRepository articles;

    @Autowired
    private SocialNetworkRepository socialNetwork;

    @GetMapping("/footer")
    public List<SocialNetwork> fetchNetworks(){
        return socialNetwork.findAll();
    }

    @GetMapping("/mainPage")
    public List<Article> fetchArticles(){
        return articles.findAll();
    }

    @GetMapping("/Biographie")
    public Article fetchBiography(){
        return articles.findByTitle("Biographie");
    }

    @GetMapping("/Services")
    public Article fetchServices(){
        return articles.findByTitle("Mes Services");
    }

    @GetMapping("/Tarifs")
    public Article fetchTarifs(){
        return articles.findByTitle("Mes tarifs");
    }

}
