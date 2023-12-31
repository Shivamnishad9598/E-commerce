package com.example.ecommerce.repository;

import com.example.ecommerce.Enum.ProductCategory;
import com.example.ecommerce.model.Product;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.*;
import java.util.List;
import java.util.ListResourceBundle;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByProductCategory(ProductCategory productCategory);

    @Query(value = "select p from Product p where p.price > :price and p.productCategory=:category")
    List<Product> getAllProductsByPriceAndCategory(int price, String category);
}
