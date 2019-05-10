package com.example.demo.dto;

import com.example.demo.entity.Category;
import com.example.demo.entity.CharityProject;
import com.example.demo.entity.DonationRecord;

import java.util.List;

public class MyDonationDTO {
    private List<Category> categories;
    private List<CharityProject> charityProjects;
    private List<DonationRecord> donationRecords;
    public MyDonationDTO(){

    }
    public MyDonationDTO(List<Category> categories,List<CharityProject> charityProjects,List<DonationRecord> donationRecords){
        this.categories = categories;
        this.charityProjects = charityProjects;
        this.donationRecords = donationRecords;
    }
    public List<Category> getCategories() {
        return categories;
    }

    public List<CharityProject> getCharityProjects() {
        return charityProjects;
    }

    public List<DonationRecord> getDonationRecords() {
        return donationRecords;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setCharityProjects(List<CharityProject> charityProjects) {
        this.charityProjects = charityProjects;
    }

    public void setDonationRecords(List<DonationRecord> donationRecords) {
        this.donationRecords = donationRecords;
    }
}
