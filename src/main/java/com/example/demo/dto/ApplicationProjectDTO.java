package com.example.demo.dto;

import java.sql.Date;
import java.util.List;

public class ApplicationProjectDTO {
    private int categoryId;
    private int userId;
    private String projectName;
    private String projectImagePath;
    private String introduce;
    private String projectPlan;
    private Double budget;//募捐金额:预算
    private String budgetBreakdown;//预算明细
    private Date startingTime;
    private Date endingTime;
    private List<String> images;

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectImagePath(String projectImagePath) {
        this.projectImagePath = projectImagePath;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public void setProjectPlan(String projectPlan) {
        this.projectPlan = projectPlan;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public void setBudgetBreakdown(String budgetBreakdown) {
        this.budgetBreakdown = budgetBreakdown;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public void setEndingTime(Date endingTime) {
        this.endingTime = endingTime;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getUserId() {
        return userId;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectImagePath() {
        return projectImagePath;
    }

    public String getIntroduce() {
        return introduce;
    }

    public String getProjectPlan() {
        return projectPlan;
    }

    public Double getBudget() {
        return budget;
    }

    public String getBudgetBreakdown() {
        return budgetBreakdown;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public Date getEndingTime() {
        return endingTime;
    }

    public List<String> getImages() {
        return images;
    }
}
