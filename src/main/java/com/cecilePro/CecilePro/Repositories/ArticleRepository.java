package com.cecilePro.CecilePro.Repositories;

import com.cecilePro.CecilePro.Entities.Article;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ArticleRepository extends MongoRepository<Article, ObjectId> {
    @Query("title = ?0")
    Article findArticleByTitle(String title);
}
