package com.example.internship_ngovantuyen.model.product;

import com.example.internship_ngovantuyen.model.BaseEntity;
import com.example.internship_ngovantuyen.model.auth.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "discount")
@Entity
public class Discount extends BaseEntity {
    private int percent_discount;
    private Date expiration_date;
    private String title;


}
