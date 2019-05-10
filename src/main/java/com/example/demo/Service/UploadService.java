package com.example.demo.Service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    public boolean upload(MultipartFile multipartFile);
}
