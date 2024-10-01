package com.example.internship_ngovantuyen.dto.discount;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class DiscountResponse {
    private Long id;
    private int percent_discount;
    private Date expiration_date;
    private String title;
    private Long create_by;
    private Long update_by;
    private Date create_at;
    private Date update_at;


}
