package com.example.demo.ServiceImpl;

import com.example.demo.Service.CharityProjectService;
import com.example.demo.dao.mapper.CategoryMapper;
import com.example.demo.dao.mapper.CharityProjectMapper;
import com.example.demo.dao.mapper.DonationRecordMapper;
import com.example.demo.entity.Category;
import com.example.demo.entity.CharityProject;
import com.example.demo.entity.DonationRecord;
import com.example.demo.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Component
@Transactional
@Service
public class CharityProjectServiceImpl implements CharityProjectService {
    @Autowired
    private final CategoryMapper categoryMapper;
    @Autowired
    private final CharityProjectMapper charityProjectMapper;
    @Autowired
    private final DonationRecordMapper donationRecordMapper;
    public CharityProjectServiceImpl(CategoryMapper categoryMapper,CharityProjectMapper charityProjectMapper,DonationRecordMapper donationRecordMapper){
        this.categoryMapper = categoryMapper;
        this.charityProjectMapper = charityProjectMapper;
        this.donationRecordMapper = donationRecordMapper;
    }
    @Override
    public List<Category> getAllCategory() {//获取所有项目类别
        return categoryMapper.getAllCategory();
    }

    @Override
    public Category getCategoryById(int categoryId) {

        return categoryMapper.getCategoryById(categoryId);
    }

    @Override
    public List<CharityProject> getCharityProjectByCategoryId(int categoryId) {

        return charityProjectMapper.getCharityProjectByCategoryId(categoryId);
    }

    @Override
    public List<CharityProject> getThreeCharityProjectByCategoryId(int categoryId) {
        List<CharityProject> allProjects = getCharityProjectByCategoryId(categoryId);
        List<CharityProject> projects = new ArrayList<>();
        for(int i = 0;i < allProjects.size();i++){
            projects.add(allProjects.get(i));
        }
        return projects;
    }

    @Override
    public List<List<CharityProject>> getHomepageCharityProject(List<Category> categorys) {
        List<List<CharityProject>> homepageProjects = new ArrayList<>();
        for(int i = 0;i < categorys.size();i++){
            int id = categorys.get(i).getCategoryId();
            List<CharityProject> projects = getThreeCharityProjectByCategoryId(id);
            homepageProjects.add(projects);
        }
        return homepageProjects;
    }

    @Override
    public CharityProject getCharityProjectById(int charityProjectId) {
        return charityProjectMapper.getCharityProjectById(charityProjectId);
    }

    @Override
    public List<Feedback> getFeedbackByProjectId(int charityProjectId) {
        return charityProjectMapper.getFeedbackByProjectId(charityProjectId);
    }

    @Override
    public boolean addDonationRecord(DonationRecord donationRecord) {
        int userId = donationRecord.getUserId();
        int projectId = donationRecord.getProjectId();
        DonationRecord dr = getDonationRecordByUserIdAndProjectId(userId,projectId);
        if(dr != null){//查询是否捐赠过
            dr.setDonationNumber(dr.getDonationNumber() + 1);
            double newAmount = dr.getDonationAmount() + donationRecord.getDonationAmount();
            dr.setDonationAmount(newAmount);
            if(updateDonationRecord(dr))//是否更新成功
                return true;
            else
                return false;
        }
        else if(donationRecordMapper.addDonationRecord(donationRecord) >= 0){//是否添加成功
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean updateDonationRecord(DonationRecord donationRecord) {
        if(donationRecordMapper.updateDonationRecord(donationRecord) > 0)
            return true;
        return false;
    }
    @Override
    public DonationRecord getDonationRecordByUserIdAndProjectId(int userId, int projectId) {
        return donationRecordMapper.getDonationRecordByUserIdAndProjectId(userId,projectId);
    }
    @Override
    public List<DonationRecord> getDonationRecordByUserId(int userId) {
        List<DonationRecord> donationRecords = donationRecordMapper.getDonationRecordByUserId(userId);
        return donationRecords;
    }


}
