package com.example.internship_ngovantuyen.mapper;

import com.example.internship_ngovantuyen.dto.category.CategoryRequest;
import com.example.internship_ngovantuyen.dto.category.CategoryResponse;
import com.example.internship_ngovantuyen.model.product.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends GenericMapper<Category, CategoryRequest, CategoryResponse>{
}
