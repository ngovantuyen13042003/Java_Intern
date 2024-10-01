package com.example.internship_ngovantuyen.controller;

import com.example.internship_ngovantuyen.dto.image.ImageResponse;
import com.example.internship_ngovantuyen.mapper.ImageMapper;
import com.example.internship_ngovantuyen.model.product.Image;
import com.example.internship_ngovantuyen.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/images")

public class ImageController {
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private ImageMapper imageMapper;
    @GetMapping
    public ResponseEntity<List<ImageResponse>> getAll() {
        List<Image>  images =  imageRepository.findAll();
        List<ImageResponse> imgResponse = new ArrayList<>();
        for(Image img : images) {
            imgResponse.add(imageMapper.entityToResponse(img)) ;
        }
        return ResponseEntity.ok(imgResponse);
    }
}
