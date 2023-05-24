package com.ecommerce.onlineshopping.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineshopping.model.CurrentConverter;

@Repository
public interface CurrentConverterRepository extends JpaRepository<CurrentConverter, Long> {

}
