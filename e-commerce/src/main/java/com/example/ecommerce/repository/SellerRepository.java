package com.example.ecommerce.repository;

import com.example.ecommerce.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller , Integer> {

    Seller findByEmailId(String email);
}
