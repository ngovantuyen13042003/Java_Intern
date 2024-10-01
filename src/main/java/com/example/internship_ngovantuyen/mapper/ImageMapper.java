package com.example.internship_ngovantuyen.mapper;

import com.example.internship_ngovantuyen.dto.image.ImageRequest;
import com.example.internship_ngovantuyen.dto.image.ImageResponse;
import com.example.internship_ngovantuyen.model.product.Image;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageMapper extends GenericMapper<Image, ImageRequest, ImageResponse>{
}
