package com.abtu.service.impl;

import com.abtu.dao.UserDao;
import com.abtu.entity.User;
import com.abtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 12522
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("UserDao")
    private UserDao userDao;


    @Override
    public User findByUsernameAndPwd(String username, String password) {
        return userDao.findByUsernameANDpwd(username, password);
    }

}
