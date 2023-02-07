package com.cecilePro.CecilePro.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("SocialNetwork")
public class SocialNetwork {
    @Id
    private ObjectId _id;
    private String networkName;
    private String networkURL;
}
