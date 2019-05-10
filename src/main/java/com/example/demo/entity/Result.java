package com.example.demo.entity;

import java.io.Serializable;

public class Result implements Serializable {

    //判断结果
    private boolean success;
    //返回信息
    private String message;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
