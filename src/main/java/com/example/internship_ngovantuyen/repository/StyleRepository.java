package com.example.internship_ngovantuyen.repository;

import com.example.internship_ngovantuyen.model.product.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends JpaRepository<Style, Long>, JpaSpecificationExecutor<Style> {
}
