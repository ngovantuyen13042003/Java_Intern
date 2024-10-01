package com.example.internship_ngovantuyen.service.category;

import com.example.internship_ngovantuyen.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

}
