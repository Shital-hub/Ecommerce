package com.ecommerce.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.onlineshopping.model.CurrencyConversionBean;
/**
 * 
 * @author Poonam
 *
 */
@Repository
public interface CurrencyConversionBeanRepository extends JpaRepository<CurrencyConversionBean,Long> {
	
		
}

