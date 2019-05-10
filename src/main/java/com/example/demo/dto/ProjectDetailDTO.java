package com.example.demo.dto;

import com.example.demo.entity.CharityProject;
import com.example.demo.entity.Feedback;
import com.example.demo.entity.Image;

import java.util.List;

public class ProjectDetailDTO {
    private CharityProject charityProject;
    private List<Feedback> feedbacks;
    private List<Image> images;

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setCharityProject(CharityProject charityProject) {
        this.charityProject = charityProject;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public CharityProject getCharityProject() {
        return charityProject;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }
}
