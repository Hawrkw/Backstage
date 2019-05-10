package com.example.demo.entity;
import java.sql.Date;
public class CharityProject {
    private int projectId;
    private int categoryId;
    private int userId;
    private String projectName;
    private String projectImagePath;
    private Double raisedFunds;
    private int participantNumber;//捐款人数
    private String introduce;
    private String projectPlan;
    private Double budget;//募捐金额
    private String budgetBreakdown;//Z预算明细
    private int state;
    private Date addTime;
    private Date startingTime;
    private Date endingTime;

    public String getProjectImagePath() {
        return projectImagePath;
    }

    public void setProjectImagePath(String projectImagePath) {
        this.projectImagePath = projectImagePath;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setRaisedFunds(Double raisedFunds) {
        this.raisedFunds = raisedFunds;
    }

    public void setParticipantNumber(int participantNumber) {
        this.participantNumber = participantNumber;
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

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public void setEndingTime(Date endingTime) {
        this.endingTime = endingTime;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public Double getRaisedFunds() {
        return raisedFunds;
    }

    public int getParticipantNumber() {
        return participantNumber;
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

    public Date getAddTime() {
        return addTime;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public Date getEndingTime() {
        return endingTime;
    }
}
