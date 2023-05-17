package com.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Reimbursement;
import com.ecommerce.onlineshopping.service.ReimbursementService;

@RestController
@RequestMapping("/reimbursement")
public class ReimbursementController {

	@Autowired
	private ReimbursementService reimbursementService;

	@PostMapping("/saveReimbursementDetails")
	public ResponseEntity<Reimbursement> saveReimbursementDetails(@RequestBody Reimbursement reimbursement) {

		Reimbursement reimbursement2 = reimbursementService.addReimbursementDetails(reimbursement);
		return ResponseEntity.ok().body(reimbursement2);

	}

	@PutMapping("/updateReimbursemetDetails/{id}")
	public ResponseEntity<Reimbursement> updateReimbursementDetails(@PathVariable("id") Integer id,@RequestBody Reimbursement reimbursement) {

		Reimbursement updateReimbursement = reimbursementService.updateReimbursementDetails(reimbursement, id);
		return ResponseEntity.ok().body(updateReimbursement);

	}
	
	@GetMapping("/getReimbursement/{id}")
	public ResponseEntity<Reimbursement> getReimbursementDetails(@PathVariable("id") Integer Id) {
		
		Reimbursement reimbursement= reimbursementService.getReimbursementDetails(Id);
		
		
		return ResponseEntity .ok (reimbursement)  ;
		
	}


}
