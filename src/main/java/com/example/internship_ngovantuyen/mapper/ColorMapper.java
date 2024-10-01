package com.example.internship_ngovantuyen.mapper;

import com.example.internship_ngovantuyen.dto.color.ColorRequest;
import com.example.internship_ngovantuyen.dto.color.ColorResponse;
import com.example.internship_ngovantuyen.model.product.Color;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ColorMapper extends GenericMapper<Color, ColorRequest, ColorResponse>{
}
