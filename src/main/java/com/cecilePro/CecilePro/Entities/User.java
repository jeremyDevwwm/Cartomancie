package com.cecilePro.CecilePro.Entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("Users")
public class User {
    @Id
    private ObjectId _id;
    private String firstname;
    private String lastname;
    private String email;
    private String message;

}
