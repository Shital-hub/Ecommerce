package com.ecommerce.onlineshopping.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Reimbursement;
import com.ecommerce.onlineshopping.service.ReimbursementService;

@Service
public class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	private ReimbursementRepository reimbursementRepository;

	@Override
	public Reimbursement addReimbursementDetails(Reimbursement reimbursement) {
		Reimbursement reimbursement1 = reimbursementRepository.save(reimbursement);
		return reimbursement1;
	}

}
