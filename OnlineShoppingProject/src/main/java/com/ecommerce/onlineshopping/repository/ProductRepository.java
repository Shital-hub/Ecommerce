package com.ecommerce.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineshopping.model.Prouduct;

@Repository
public interface ProductRepository extends JpaRepository<Prouduct, Integer> {

}
