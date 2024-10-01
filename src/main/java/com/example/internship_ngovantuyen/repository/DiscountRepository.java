package com.example.internship_ngovantuyen.repository;

import com.example.internship_ngovantuyen.model.product.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long>, JpaSpecificationExecutor<Discount> {
}
