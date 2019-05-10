package com.example.demo.dao.mapper;

import com.example.demo.entity.Image;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMapper {
    public Image getImageByProjectId(int projectId);
}
