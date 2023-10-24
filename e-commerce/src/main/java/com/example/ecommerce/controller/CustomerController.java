package com.example.ecommerce.controller;


import com.example.ecommerce.dto.ResponseDto.CustomerResponseDto;
import com.example.ecommerce.exception.MobileNoAlreadyPresentException;
import com.example.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public CustomerResponseDto addCustomer(@RequestBody CustomerResponseDto customerResponseDto) throws MobileNoAlreadyPresentException{

        return customerService.addCustomer(customerResponseDto);
    }

    // view all customers

    // get a customer

    // get all customers whose age is greater than 25

    // get all customers who user VISA  card

    // update a customer info by email

    // delete  a customer by email/mob



}
