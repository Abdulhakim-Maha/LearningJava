package com.example.Test.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Data
public class User {

    @Id
    private String id;

    @Field
    private String firstname;

    @Field
    private String lastname;

//    public User (){}

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

//    @Override
//    public String toString() {
//        return String.format("User[id='%s', firstname='%s', lastname='%s'", id, firstname, lastname);
//    }
}
