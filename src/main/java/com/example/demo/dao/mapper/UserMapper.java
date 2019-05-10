package com.example.demo.dao.mapper;
import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUserByPhone(String phone);
    User getUserByIdentityNumber(String identityNumber);
    int register(User user);
}