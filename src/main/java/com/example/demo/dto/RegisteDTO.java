package com.example.demo.dto;

import org.springframework.web.multipart.MultipartFile;

public class RegisteDTO {

    private String avatarPath;
    private String phone;
    private String password;
    private String nickName;
    private String realName;
    private String identityNumber;
    private Object imageFile;

    public void setImageFile(Object imageFile) {
        this.imageFile = imageFile;
    }

    public Object getImageFile() {
        return imageFile;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
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
}
