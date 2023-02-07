package com.cecilePro.CecilePro.Repositories;

import com.cecilePro.CecilePro.Entities.User;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface UserRepository extends MongoRepository<User, ObjectId> {

    @Query("firstname = ?0")
    User findByFirstname(String firstname);

    List<User> findAll();
}
