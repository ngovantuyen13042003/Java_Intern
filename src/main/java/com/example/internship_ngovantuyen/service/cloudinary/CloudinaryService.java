package com.example.internship_ngovantuyen.service.cloudinary;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CloudinaryService {
    List<String> upload(List<MultipartFile> file, String folderName);

    Boolean delete(String imgUrl);
    boolean delete(List<String> imgUrls);

}
