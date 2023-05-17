package com.ecommerce.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.model.Reimbursement;
import com.ecommerce.onlineshopping.model.User;
import com.ecommerce.onlineshopping.service.ReimbursementService;

@RestController
@RequestMapping("/reimbursement")
public class ReimbursementController {
	
	@Autowired
	private ReimbursementService reimbursementService;
	
	@PostMapping("/saveReimbursementDetails")
	public ResponseEntity<Reimbursement> saveReimbursementDetails(@RequestBody Reimbursement reimbursement) {
	
		Reimbursement reimbursement2=reimbursementService.addReimbursementDetails(reimbursement);
		return ResponseEntity.ok().body(reimbursement2);

	}
}
