package com.example.demo.ServiceImpl;

import com.example.demo.Service.UploadService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
@Component
@Transactional
@Service
public class UploadServiceImpl implements UploadService {
    private static String UPLOAD_PATH = "F://SpringProject//demo//images//";
    public boolean upload(MultipartFile file){
        if(file.isEmpty()){
            return false;
        }
        try{
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_PATH + file.getOriginalFilename());
            Files.write(path, bytes);
            return true;
        }catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }

}
