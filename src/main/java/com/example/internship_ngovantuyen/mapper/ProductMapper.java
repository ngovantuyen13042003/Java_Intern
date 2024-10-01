package com.example.internship_ngovantuyen.mapper;

import com.example.internship_ngovantuyen.dto.product.ProductRequest;
import com.example.internship_ngovantuyen.dto.product.ProductResponse;
import com.example.internship_ngovantuyen.model.product.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<Product, ProductRequest, ProductResponse> {
}
