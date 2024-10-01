package com.example.internship_ngovantuyen.controller;

import com.example.internship_ngovantuyen.constant.ResourceName;
import com.example.internship_ngovantuyen.constant.SearchFields;
import com.example.internship_ngovantuyen.dto.category.CategoryRequest;
import com.example.internship_ngovantuyen.dto.category.CategoryResponse;
import com.example.internship_ngovantuyen.dto.color.ColorRequest;
import com.example.internship_ngovantuyen.dto.color.ColorResponse;
import com.example.internship_ngovantuyen.dto.discount.DiscountRequest;
import com.example.internship_ngovantuyen.dto.discount.DiscountResponse;
import com.example.internship_ngovantuyen.dto.image.ImageRequest;
import com.example.internship_ngovantuyen.dto.image.ImageResponse;
import com.example.internship_ngovantuyen.dto.product.ProductRequest;
import com.example.internship_ngovantuyen.dto.product.ProductResponse;
import com.example.internship_ngovantuyen.dto.style.StyleRequest;
import com.example.internship_ngovantuyen.dto.style.StyleResponse;
import com.example.internship_ngovantuyen.mapper.*;
import com.example.internship_ngovantuyen.model.product.*;
import com.example.internship_ngovantuyen.repository.*;
import com.example.internship_ngovantuyen.service.CrudService;
import com.example.internship_ngovantuyen.service.GenericService;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPatternParser;


import java.util.List;

@Component
@AllArgsConstructor
public class GenericMapperRegister {
    private ApplicationContext context;
    private RequestMappingHandlerMapping handlerMapping;

    //Controller
    private GenericController<CategoryRequest, CategoryResponse> categoryController;
    private GenericController<StyleRequest, StyleResponse> styleController;
    private GenericController<DiscountRequest, DiscountResponse> discountController;
    private GenericController<ProductRequest, ProductResponse> productController;
    private GenericController<ImageRequest, ImageResponse> imageController;
    private GenericController<ColorRequest, ColorResponse> colorController;

    //Service
    private GenericService<Category, CategoryRequest, CategoryResponse> categoryService;
    private GenericService<Style, StyleRequest, StyleResponse> styleService;
    private GenericService<Discount, DiscountRequest, DiscountResponse> discountService;
    private GenericService<Product, ProductRequest, ProductResponse> productService;
    private GenericService<Image, ImageRequest, ImageResponse> imageService;
    private GenericService<Color, ColorRequest, ColorResponse> colorService;


    @PostConstruct
    public void registerControllers() throws NoSuchMethodException{
        register("categories",
                categoryController,
                categoryService.init(
                        context.getBean(CategoryRepository.class),
                        context.getBean(CategoryMapper.class),
                        SearchFields.CATEGORY,
                        ResourceName.CATEGORY
                ),
                CategoryRequest.class);

        register("styles",
                styleController,
                styleService.init(
                        context.getBean(StyleRepository.class),
                        context.getBean(StyleMapper.class),
                        SearchFields.STYLE,
                        ResourceName.STYLE
                ),
                StyleRequest.class);

        register("discounts",
                discountController,
                discountService.init(
                        context.getBean(DiscountRepository.class),
                        context.getBean(DiscountMapper.class),
                        SearchFields.DISCOUNT,
                        ResourceName.DISCOUNT
                ),
                DiscountRequest.class);

        register("products",
                productController,
                productService.init(
                        context.getBean(ProductRepository.class),
                        context.getBean(ProductMapper.class),
                        SearchFields.PRODUCT,
                        ResourceName.PRODUCT
                ),
        ProductRequest.class );

        register("images",
                imageController,
                imageService.init(
                        context.getBean(ImageRepository.class),
                        context.getBean(ImageMapper.class),
                        SearchFields.IMAGE,
                        ResourceName.IMAGE
                ),
                ImageRequest.class );

        register("colors",
                colorController,
                colorService.init(
                        context.getBean(ColorRepository.class),
                        context.getBean(ColorMapper.class),
                        SearchFields.COLOR,
                        ResourceName.COLOR
                ),
                ColorRequest.class);
    }

    private <I, O> void register(String resource,
                                 GenericController<I, O> controller,
                                 CrudService<Long, I, O> service,
                                 Class<I> requestType
    ) throws NoSuchMethodException {
        RequestMappingInfo.BuilderConfiguration options = new RequestMappingInfo.BuilderConfiguration();
        options.setPatternParser(new PathPatternParser());

        controller.setCrudService(service);
        controller.setRequestType(requestType);

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getAllResources", int.class, int.class,
                        String.class, String.class, String.class, boolean.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.POST)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("createResource", JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.PUT)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("updateResource", Long.class, JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.DELETE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.DELETE)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResources", List.class)
        );
    }


















}
