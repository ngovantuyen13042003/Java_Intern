package com.example.internship_ngovantuyen.service.product;

import com.example.internship_ngovantuyen.constant.ResourceName;
import com.example.internship_ngovantuyen.constant.SearchFields;
import com.example.internship_ngovantuyen.dto.ListResponse;
import com.example.internship_ngovantuyen.dto.category.CategoryResponse;
import com.example.internship_ngovantuyen.dto.discount.DiscountResponse;
import com.example.internship_ngovantuyen.dto.product.ProductRequest;
import com.example.internship_ngovantuyen.dto.product.ProductResponse;
import com.example.internship_ngovantuyen.dto.style.StyleResponse;
import com.example.internship_ngovantuyen.exception.ResourceNotFoundException;
import com.example.internship_ngovantuyen.mapper.CategoryMapper;
import com.example.internship_ngovantuyen.mapper.DiscountMapper;
import com.example.internship_ngovantuyen.mapper.ProductMapper;
import com.example.internship_ngovantuyen.mapper.StyleMapper;
import com.example.internship_ngovantuyen.model.product.*;
import com.example.internship_ngovantuyen.repository.*;
import com.example.internship_ngovantuyen.service.cloudinary.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CloudinaryService cloudinaryService;
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private DiscountRepository discountRepository;
    @Autowired
    private StyleRepository styleRepository;

    @Value("${cloudinary.folderName}")
    private String rootFolder;
    @Override
    public ListResponse<ProductResponse> findAll(int page, int size, String sort, String filter, String search, boolean all) {


        return defaultFindAll(page, size, sort, filter, search, all, SearchFields.PRODUCT, productRepository, productMapper);

    }

    @Override
    public ProductResponse findById(Long aLong) {
        return defaultFindById(aLong, productRepository, productMapper, ResourceName.PRODUCT);
    }

    @Override
    public void delete(Long id) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(ResourceName.PRODUCT, "id", id));
        product.setEnnable(false);
        productRepository.save(product);
    }

    @Override
    public void delete(List<Long> ids) {
        List<Product> products = productRepository.findAllById(ids);
        if (products.size() != ids.size()) {
            throw new ResourceNotFoundException(ResourceName.PRODUCT, "id", "Some products not found");
        }
        products.forEach(product -> product.setEnnable(false));
        productRepository.saveAll(products);
    }

    @Override
    public ProductResponse save(Long aLong, ProductRequest request) {
        return defaultSave(aLong, request, productRepository, productMapper, ResourceName.PRODUCT);
    }
    @Override
    public ProductResponse save(ProductRequest request) {
        Product product = productMapper.requesToEntity(request);

        Style style = styleRepository.findById(request.getStyle_id()).orElseThrow(
                () -> new ResourceNotFoundException(ResourceName.STYLE, "id", "Some styles not found")
        );

        Category category = categoryRepository.findById(request.getCategory_id()).orElseThrow(
                () -> new ResourceNotFoundException(ResourceName.CATEGORY, "id", "Some categories not found")
        );

        Discount discount = discountRepository.findById(request.getDiscount_id()).orElseThrow(
                () -> new ResourceNotFoundException(ResourceName.DISCOUNT, "id", "Some discounts not found")
        );

        product.setDiscount(discount);
        product.setCategory(category);
        product.setStyle(style);

        Product productAfterSave = productRepository.save(product);

        List<Image> images = new ArrayList<>();
//        image save
        if(!request.getImages().isEmpty()) {
            List<String> url_image = cloudinaryService.upload(request.getImages(), rootFolder);
            for(String url : url_image) {
                Image image = new Image();
                image.setProduct_id(productAfterSave);
                image.setUrl_file(url);
                image.setEnnable(true);
                images.add(imageRepository.save(image));

            }
        }
        productAfterSave.setImages(images);
        return productMapper.entityToResponse(productAfterSave);
    }
















}
