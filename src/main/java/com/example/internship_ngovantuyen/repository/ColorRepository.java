package com.example.internship_ngovantuyen.repository;

import com.example.internship_ngovantuyen.model.product.Color;
import com.example.internship_ngovantuyen.model.product.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long>, JpaSpecificationExecutor<Color> {
}
