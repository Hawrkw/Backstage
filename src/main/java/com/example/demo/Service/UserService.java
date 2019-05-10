package com.example.demo.Service;
import com.example.demo.entity.User;

public interface UserService {
    public User getUserByPhone(String phone);
    public User getUserByIdentityNumber(String identityNumber);
    public String register(User user);
}
