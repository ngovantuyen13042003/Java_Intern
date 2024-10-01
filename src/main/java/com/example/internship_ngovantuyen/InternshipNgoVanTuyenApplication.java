package com.example.internship_ngovantuyen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EntityScan(basePackages = "com.example.internship_ngovantuyen.model")
public class InternshipNgoVanTuyenApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternshipNgoVanTuyenApplication.class, args);
    }

}
