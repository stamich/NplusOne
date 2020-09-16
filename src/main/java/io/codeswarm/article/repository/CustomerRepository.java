package io.codeswarm.article.repository;

import io.codeswarm.article.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Override
    @Query("SELECT DISTINCT c FROM Customer c JOIN FETCH c.orders")
    List<Customer> findAll();
}
