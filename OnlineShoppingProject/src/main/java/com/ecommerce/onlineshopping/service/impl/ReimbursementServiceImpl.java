package com.ecommerce.onlineshopping.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Reimbursement;
import com.ecommerce.onlineshopping.repository.ReimbursementRepository;
import com.ecommerce.onlineshopping.service.ReimbursementService;

@Service
public  class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	private ReimbursementRepository reimbursementRepository;

	@Override
	public Reimbursement addReimbursementDetails(Reimbursement reimbursement) {
		Reimbursement reimbursement1 = reimbursementRepository.save(reimbursement);
		return reimbursement1;
	}

	@Override
	public Reimbursement updateReimbursementDetails(Reimbursement reimbursement, Integer id) {
		Optional<Reimbursement> optional = reimbursementRepository.findById(id);
		Reimbursement oldReimbursement = optional.get();

		oldReimbursement.setUserId(reimbursement.getUserId());
		oldReimbursement.setAmount(reimbursement.getAmount());
		oldReimbursement.setStatus(reimbursement.getStatus());
		oldReimbursement.setSubmitDate(reimbursement.getSubmitDate());
		oldReimbursement.setType(reimbursement.getType());

		Reimbursement updateReimbursement = reimbursementRepository.save(oldReimbursement);
		
		return updateReimbursement;
	}

	@Override
	public Reimbursement getReimbursementDetails(Integer id) {
		
		
	Optional<Reimbursement>  optional 	= reimbursementRepository.findById(id);
		
	Reimbursement reimbursement	= optional.get();
	
		return reimbursement;
	}

}
