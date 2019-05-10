package com.example.demo.entity;
import java.sql.Date;
public class Feedback {
    private int feedbackId;
    private int projectId;
    private Date time;
    private String feedbackName;
    private String feedbackIntroduce;

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setFeedbackName(String feedbackName) {
        this.feedbackName = feedbackName;
    }

    public void setGetFeedbackIntroduce(String feedbackIntroduce) {
        this.feedbackIntroduce = feedbackIntroduce;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public int getProjectId() {
        return projectId;
    }

    public Date getTime() {
        return time;
    }

    public String getFeedbackName() {
        return feedbackName;
    }

    public String getFeedbackIntroduce() {
        return feedbackIntroduce;
    }
}
