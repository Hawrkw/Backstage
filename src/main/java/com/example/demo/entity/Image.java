package com.example.demo.entity;

public class Image {
    private int imageId;
    private int projectId;
    private String imagePath;

    public int getImageId() {
        return imageId;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
