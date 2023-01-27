package com.cecilePro.CecilePro.Repositories;

import com.cecilePro.CecilePro.Entities.User;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface UserRepository extends MongoRepository<User, ObjectId> {

    List<User> findAll();
}
