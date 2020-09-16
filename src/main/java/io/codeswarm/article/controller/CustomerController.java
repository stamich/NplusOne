package io.codeswarm.article.controller;

import io.codeswarm.article.model.Customer;
import io.codeswarm.article.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return repository.findAll();
    }
}
