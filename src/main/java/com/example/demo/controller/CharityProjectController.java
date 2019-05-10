package com.example.demo.controller;

import com.example.demo.Service.CharityProjectService;
import com.example.demo.dto.ApplicationProjectDTO;
import com.example.demo.dto.HomepageDTO;
import com.example.demo.dto.MyDonationDTO;
import com.example.demo.dto.ProjectDetailDTO;
import com.example.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/charityProject")
public class CharityProjectController {
    @Autowired
    private CharityProjectService charityProjectService;
    //展示主页
    @RequestMapping(value = "/homepage",method = RequestMethod.GET)
    public HomepageDTO showHomepage(){
        List<Category> categories = charityProjectService.getAllCategory();
        List<List<CharityProject>> homepageProjects = charityProjectService.getHomepageCharityProject(categories);
        List<Image> images = new ArrayList<>();
        HomepageDTO homepageDTO = new HomepageDTO(homepageProjects,categories,images);
        if(categories == null || homepageProjects == null)
            return null;
        return homepageDTO;
    }
    //展示项目详情
    @RequestMapping(value = "/projectDetail",method = RequestMethod.GET)
    public ProjectDetailDTO showProjectDetail(@RequestParam int projectId){
        ProjectDetailDTO projectDetailDTO = new ProjectDetailDTO();
        List<Feedback> feedbacks = charityProjectService.getFeedbackByProjectId(projectId);
        CharityProject charityProject = charityProjectService.getCharityProjectById(projectId);
        projectDetailDTO.setCharityProject(charityProject);
        projectDetailDTO.setFeedbacks(feedbacks);
        return projectDetailDTO;
    }
    //展示捐赠页面
    @RequestMapping(value = "/requestDonate",method = RequestMethod.GET)
    public CharityProject showDonate(@RequestParam int projectId){
        CharityProject charityProject = charityProjectService.getCharityProjectById(projectId);
        return  charityProject;
    }
    //接收捐赠信息
    @RequestMapping(value = "/submitDonate",method = RequestMethod.GET)
    public boolean submitDonate(@RequestParam int userId,int projectId,double donationAmount,String donorName){
        DonationRecord donationRecord = new DonationRecord(userId,projectId,donationAmount,donorName);

        if(charityProjectService.addDonationRecord(donationRecord))
            return true;
        return false;
    }
    //未完成
    @RequestMapping(value = "/submitApplication",method = RequestMethod.POST)
    public boolean submitApplication(@RequestBody ApplicationProjectDTO applicationProjectDTO){
        System.out.print("sd");
        return true;
    }



}
