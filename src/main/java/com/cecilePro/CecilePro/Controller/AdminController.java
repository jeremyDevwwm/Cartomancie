package com.cecilePro.CecilePro.Controller;

import com.cecilePro.CecilePro.Entities.Article;
import com.cecilePro.CecilePro.Exceptions.ModifyArticleQueryException;
import com.cecilePro.CecilePro.Repositories.ArticleRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/PzHwc83jKTz998$263")
@CrossOrigin("http://localhost:5173")
public class AdminController {
    @Autowired
    private ArticleRepository repository;
    private ModifyArticleQueryException articleQueryException;

    @GetMapping("/createArticle")
    public void createArticle(String title, String content, String authorName){
        Article newArticle = new Article();
        ObjectId _id = new ObjectId();
        newArticle.set_id(_id);
        newArticle.setTitle(title);
        newArticle.setContent(content);
        newArticle.setAuthorName(authorName);
        repository.save(newArticle);
    }

    @GetMapping("/displayModifyArticles")
    public List<Article> displayModifyArticles(){
        return repository.findAll();
    }

    @PutMapping("/modifyArticles")
    public void modifyArticles(List<Article> articles) throws ModifyArticleQueryException {
        try{
            repository.saveAll(articles);

        } catch(Exception e) {

           throw new ModifyArticleQueryException("Une erreur de requête est survenue :(");

        }


    }

}
