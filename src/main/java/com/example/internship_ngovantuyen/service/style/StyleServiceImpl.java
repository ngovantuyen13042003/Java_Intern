package com.example.internship_ngovantuyen.service.style;

import com.example.internship_ngovantuyen.repository.StyleRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public class StyleServiceImpl implements IStyleService{
    @Autowired
    private StyleRepository styleRepository;
}
