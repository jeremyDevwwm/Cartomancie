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
        String _id = new ObjectId().toHexString();
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

    @GetMapping("/modifyArticle{title}")
    public void modifyArticle(Article article, @PathVariable String title) {
        Article modifiedArticle = repository.findArticleByTitle(title);
        modifiedArticle.setTitle(article.getTitle());
        modifiedArticle.setContent(article.getContent());
        modifiedArticle.setAuthorName(article.getAuthorName());
        repository.save(modifiedArticle);
    }

    @GetMapping("/findSingle{title}")
    public Article findSingleArticle(@PathVariable String title){
        return repository.findArticleByTitle(title);
    }

    @GetMapping("/deleteArticle{title}")
    public void deleteArticle(@PathVariable String title){
       Article articleToRemove = repository.findArticleByTitle(title);
       repository.delete(articleToRemove);
    }

}
