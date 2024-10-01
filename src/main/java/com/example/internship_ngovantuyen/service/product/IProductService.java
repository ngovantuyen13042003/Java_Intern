package com.example.internship_ngovantuyen.service.product;

import com.example.internship_ngovantuyen.dto.product.ProductRequest;
import com.example.internship_ngovantuyen.dto.product.ProductResponse;
import com.example.internship_ngovantuyen.service.CrudService;

public interface IProductService extends CrudService<Long, ProductRequest, ProductResponse> {
}
