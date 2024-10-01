package com.example.internship_ngovantuyen.mapper;

import com.example.internship_ngovantuyen.dto.category.CategoryRequest;
import com.example.internship_ngovantuyen.dto.category.CategoryResponse;
import com.example.internship_ngovantuyen.dto.style.StyleRequest;
import com.example.internship_ngovantuyen.dto.style.StyleResponse;
import com.example.internship_ngovantuyen.model.product.Category;
import com.example.internship_ngovantuyen.model.product.Style;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StyleMapper extends GenericMapper<Style, StyleRequest, StyleResponse>{
}
