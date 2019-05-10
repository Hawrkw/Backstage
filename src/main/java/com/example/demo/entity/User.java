package com.example.demo.entity;

public class User {
    private int userId;
    private String phone;
    private String password;
    private String nickName;
    private String realName;
    private String identityNumber;
    private String avatarPath;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getRealName() {
        return realName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
