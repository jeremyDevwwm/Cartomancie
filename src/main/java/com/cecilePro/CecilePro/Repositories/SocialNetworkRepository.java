package com.cecilePro.CecilePro.Repositories;

import com.cecilePro.CecilePro.Entities.Article;
import com.cecilePro.CecilePro.Entities.SocialNetwork;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SocialNetworkRepository extends MongoRepository<SocialNetwork, ObjectId> {
    SocialNetwork findByNetworkName(String name);
}
