package com.icday.game.services;


import com.icday.game.databases.models.User;

public interface UserService {
    int addUser(User user);
    User getUserByUserName(String userName);
}
