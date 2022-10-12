package com.example.springdatajpamapping.repository;

import com.example.springdatajpamapping.entity.Customer;
import com.example.springdatajpamapping.service.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.example.springdatajpamapping.service.OrderResponse (c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

}
