package com.applexzs.springboot.error.services;

import com.applexzs.springboot.error.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements IUserService{

    private List<User> users;
    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "Gonzalez"));
        users.add(new User(2L, "Andres", "Mena"));
        users.add(new User(3L, "Maria", "Perez"));
        users.add(new User(4L, "Josefa", "Ramirez"));
        users.add(new User(5L, "Ale", "Guttirez"));

    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for(User u: users){
            if(u.getId().equals(id)){
                user = u;
                break;
            }
        }
        return Optional.ofNullable(user);
    }
}
