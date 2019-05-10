package com.example.demo.ServiceImpl;

import com.example.demo.Service.UserService;
import com.example.demo.dao.mapper.UserMapper;
import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }
    @Override
    public User getUserByPhone(String phone){
        User user = userMapper.getUserByPhone(phone);
        return user;
    }

    @Override
    public User getUserByIdentityNumber(String identityNumber) {
        User user = userMapper.getUserByIdentityNumber(identityNumber);
        return user;
    }

    @Override
    public String register(User user) {
        if(getUserByPhone(user.getPhone()) != null)
            return "用户已存在";
        else if(getUserByIdentityNumber(user.getIdentityNumber()) != null)
            return "用户已存在";
        else if(userMapper.register(user) >= 0)
            return "注册成功";
        else
            return "注册失败";
    }
}
