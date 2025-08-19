package com.shield.service.Impl;

import com.shield.mapper.UserMapper;
import com.shield.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int countUserTotal(){
        return userMapper.countUserTotal();
    }
}
