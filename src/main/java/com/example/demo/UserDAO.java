package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {

    private static List<User> users;

    static {
        users = new ArrayList<>(){
            {
                add(new User(1, "Юлий", "Фадеев", 23, "798673690576", "miroc70087@fitwl.com"));
                add(new User(2, "Панкратий", "Фролов", 27, "70897266818", "hirpc532087@gmail.com"));
                add(new User(3, "Аввакуум", "Доронин", 18, "7521090512", "avavav02@mail.com"));
            }
        };

        //fgeagea
        System.out.println("(.)==(.)");
    }

    public List<User> findAll() {
        return users;
    }
}
