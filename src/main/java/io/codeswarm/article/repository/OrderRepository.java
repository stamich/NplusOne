package io.codeswarm.article.repository;

import io.codeswarm.article.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Override
    @Query("SELECT DISTINCT o FROM Order o JOIN FETCH o.items")
    List<Order> findAll();
}
