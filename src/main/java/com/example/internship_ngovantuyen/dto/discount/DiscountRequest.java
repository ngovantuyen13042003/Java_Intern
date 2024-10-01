package com.example.internship_ngovantuyen.dto.discount;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class DiscountRequest {
    private int percent_discount;
    private Date expiration_date;
    private String title;

}
