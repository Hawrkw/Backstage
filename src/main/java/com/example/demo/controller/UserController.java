package com.example.demo.controller;

import com.example.demo.Service.CharityProjectService;
import com.example.demo.Service.UploadService;
import com.example.demo.Service.UserService;
import com.example.demo.dto.MyDonationDTO;
import com.example.demo.entity.Category;
import com.example.demo.entity.CharityProject;
import com.example.demo.entity.DonationRecord;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    public UserService userService;
    @Autowired
    public UploadService uploadService;
    @Autowired
    public CharityProjectService charityProjectService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public User login(@Valid String phone, String password){
        User user = userService.getUserByPhone(phone);
        if(user == null || password.equals(user.getPassword()) == false)
            return null;
        else{
            return user;
        }
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user, List<MultipartFile> files){
        for(int i = 0;i < files.size();i++){
            if(uploadService.upload(files.get(i)) == false){
                return "图片上传失败";
            }
            String avatarPath = files.get(i).getOriginalFilename();
            user.setAvatarPath(avatarPath);
        }
        return userService.register(user);
    }
    //查看我的捐赠:接收用户Id,返回category,project,donationRecord
    @RequestMapping(value = "/myDonation",method = RequestMethod.GET)
    public MyDonationDTO showMyDonation(@RequestParam int userId){
        List<DonationRecord> donationRecords = charityProjectService.getDonationRecordByUserId(userId);
        List<CharityProject> charityProjects = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        for(int i = 0;i < donationRecords.size();i++){
            int projectId = donationRecords.get(i).getProjectId();
            CharityProject charityProject = charityProjectService.getCharityProjectById(projectId);
            charityProjects.add(charityProject);
            int categoryId = charityProject.getCategoryId();
            Category category = charityProjectService.getCategoryById(categoryId);
            categories.add(category);
        }
        MyDonationDTO myDonationDTO = new MyDonationDTO(categories,charityProjects,donationRecords);
        return myDonationDTO;
    }
}
