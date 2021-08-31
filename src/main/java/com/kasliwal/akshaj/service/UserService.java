package com.kasliwal.akshaj.service;

import com.kasliwal.akshaj.model.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();
}
