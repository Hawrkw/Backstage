package com.example.demo.dto;

import com.example.demo.entity.Category;
import com.example.demo.entity.CharityProject;
import com.example.demo.entity.Image;

import java.util.List;

public class HomepageDTO {
    private List<List<CharityProject>> projects;
    private List<Category> categorys;
    private List<Image> images;

    public HomepageDTO(List<List<CharityProject>> projects, List<Category> categorys, List<Image> images) {
        this.projects = projects;
        this.categorys = categorys;
        this.images = images;
    }

    public List<List<CharityProject>> getProjects() {
        return projects;
    }

    public List<Category> getCategorys() {
        return categorys;
    }

    public void setProjects(List<List<CharityProject>> projects) {
        this.projects = projects;
    }

    public void setCategorys(List<Category> categorys) {
        this.categorys = categorys;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
