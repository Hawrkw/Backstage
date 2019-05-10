package com.example.demo.dao.mapper;

import com.example.demo.entity.DonationRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DonationRecordMapper {
    public int addDonationRecord(DonationRecord donationRecord);
    public int updateDonationRecord(DonationRecord donationRecord);
    public List<DonationRecord> getDonationRecordByUserId(int userId);
    public DonationRecord getDonationRecordByUserIdAndProjectId(int userId,int projectId);
}
