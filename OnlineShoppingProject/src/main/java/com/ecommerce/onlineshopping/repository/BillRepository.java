package com.ecommerce.onlineshopping.repository;

import com.ecommerce.onlineshopping.model.Bill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill,Integer>{

}
