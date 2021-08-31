package com.kasliwal.akshaj.service;

import com.kasliwal.akshaj.model.User;
import com.kasliwal.akshaj.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> fetchAllUser() {
        return userDAO.fetchAllUsers();
    }

    @Override
    public boolean saveUser(User user) {
        return userDAO.saveUser(user);
    }
}
