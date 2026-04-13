package com.applexzs.springboot.error.services;

import com.applexzs.springboot.error.models.domain.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAll();
    Optional<User> findById(Long id);


}
