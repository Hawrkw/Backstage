package com.example.demo.entity;

public class DonationRecord {
    private int donationRecordId;
    private int userId;
    private int projectId;
    private int donationNumber;
    private double donationAmount;
    private String donorName;

    public DonationRecord(int userId,int projectId,double donationAmount,String donorName){
        this.userId = userId;
        this.projectId = projectId;
        this.donationAmount = donationAmount;
        this.donorName = donorName;
    }
    public void setDonationRecordId(int donationRecordId) {
        this.donationRecordId = donationRecordId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setDonationNumber(int donationNumber) {
        this.donationNumber = donationNumber;
    }

    public void setDonationAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getDonationRecordId() {
        return donationRecordId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getDonationNumber() {
        return donationNumber;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public String getDonorName() {
        return donorName;
    }
}
