package com.example.springdatajpamapping.repository;

import com.example.springdatajpamapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
