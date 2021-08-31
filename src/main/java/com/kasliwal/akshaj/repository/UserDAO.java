package com.kasliwal.akshaj.repository;

import com.kasliwal.akshaj.model.User;

import java.util.List;

public interface UserDAO {
    List<User> fetchAllUsers();

    boolean saveUser(User user);
}
