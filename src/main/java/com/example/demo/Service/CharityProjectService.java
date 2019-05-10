package com.example.demo.Service;

import com.example.demo.entity.Category;
import com.example.demo.entity.CharityProject;
import com.example.demo.entity.DonationRecord;
import com.example.demo.entity.Feedback;

import java.util.List;

public interface CharityProjectService {
    public List<Category> getAllCategory();
    public Category getCategoryById(int categoryId);
    public List<CharityProject> getCharityProjectByCategoryId(int categoryId);
    public List<CharityProject> getThreeCharityProjectByCategoryId(int categoryId);
    public List<List<CharityProject>> getHomepageCharityProject(List<Category> categorys);
    public CharityProject getCharityProjectById(int charityProjectId);
    public List<Feedback> getFeedbackByProjectId(int charityProjectId);
    public boolean addDonationRecord(DonationRecord donationRecord);
    public boolean updateDonationRecord(DonationRecord donationRecord);
    public List<DonationRecord> getDonationRecordByUserId(int userId);
    public DonationRecord getDonationRecordByUserIdAndProjectId(int userId,int projectId);
}
