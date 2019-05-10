package com.example.demo.dao.mapper;

import com.example.demo.entity.CharityProject;
import com.example.demo.entity.DonationRecord;
import com.example.demo.entity.Feedback;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharityProjectMapper {
    public List<CharityProject> getCharityProjectByCategoryId(int categoryId);
    public CharityProject getCharityProjectById(int charityProjectId);
    public List<Feedback> getFeedbackByProjectId(int charityProjectId);

}
