package com.example.internship_ngovantuyen.service.discount;

import com.example.internship_ngovantuyen.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements IDiscountService{
    @Autowired
    private DiscountRepository discountRepository;
}
