package com.example.internship_ngovantuyen.controller;

import com.example.internship_ngovantuyen.dto.product.ProductRequest;
import com.example.internship_ngovantuyen.dto.product.ProductResponse;

import com.example.internship_ngovantuyen.service.product.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private IProductService productService;


    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ProductResponse> saveProduct(
            @RequestParam("quantity") int quantity,
            @RequestParam("product_name") String product_name,
            @RequestParam("size") String size,
            @RequestParam("price") Double price,
            @RequestParam("description") String description,
            @RequestPart("images") List<MultipartFile> images,
            @RequestParam("discount") Long discount,
            @RequestParam("category") Long category,
            @RequestParam("style") Long style)
    {

        ProductRequest productRequest = new ProductRequest();
        productRequest.setQuantity(quantity);
        productRequest.setProduct_name(product_name);
        productRequest.setSize(size);
        productRequest.setPrice(price);
        productRequest.setDescription(description);
        productRequest.setImages(images);
        productRequest.setDiscount_id(discount);
        productRequest.setCategory_id(category);
        productRequest.setStyle_id(style);

        ProductResponse productResponse = productService.save(productRequest);
        return ResponseEntity.ok(productResponse);


    }
}


