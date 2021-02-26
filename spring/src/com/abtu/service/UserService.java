package com.abtu.service;


import com.abtu.entity.User;


public interface UserService {

    User findByUsernameAndPwd(String username, String password);
}
