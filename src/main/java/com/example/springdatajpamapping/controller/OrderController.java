package com.example.springdatajpamapping.controller;

import com.example.springdatajpamapping.entity.Customer;
import com.example.springdatajpamapping.repository.CustomerRepository;
import com.example.springdatajpamapping.repository.ProductRepository;
import com.example.springdatajpamapping.service.OrderRequest;
import com.example.springdatajpamapping.service.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrder(){
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }

}
