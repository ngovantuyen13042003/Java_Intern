package com.example.internship_ngovantuyen.mapper;

import com.example.internship_ngovantuyen.dto.discount.DiscountRequest;
import com.example.internship_ngovantuyen.dto.discount.DiscountResponse;
import com.example.internship_ngovantuyen.model.product.Discount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DiscountMapper extends GenericMapper<Discount, DiscountRequest, DiscountResponse> {

}
