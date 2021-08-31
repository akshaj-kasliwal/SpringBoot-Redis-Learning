package com.kasliwal.akshaj.repository;

import com.kasliwal.akshaj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//As the class provide mechanism for storage, Retrieval , search , update and delete operation on objects
@Repository
public class UserDaoImpl implements UserDAO{
    @Autowired
    private RedisTemplate redisTemplate;

    private static  final String KEY = "Users";

    @Override
    public List<User> fetchAllUsers() {
        List<User> users = redisTemplate.opsForHash().values(KEY);
        return users;
    }

    @Override
    public boolean saveUser(User user) {
        try{
            redisTemplate.opsForHash().put(KEY,user.getId().toString(), user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
