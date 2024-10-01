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
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "style")
public class Style extends BaseEntity {
    private String style_name;

}
