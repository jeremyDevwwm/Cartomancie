package com.cecilePro.CecilePro.Entities;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("Articles")
public class Article extends Content{
    @Id
    private ObjectId _id;
    private String title;
    private String content;
    private String authorName;

}
