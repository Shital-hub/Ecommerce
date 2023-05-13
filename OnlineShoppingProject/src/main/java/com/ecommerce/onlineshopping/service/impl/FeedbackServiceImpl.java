package com.ecommerce.onlineshopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Feedback;
import com.ecommerce.onlineshopping.repository.FeedbackRepository;
import com.ecommerce.onlineshopping.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public Feedback postUserFeedback(Feedback feedback) {
		Feedback feedback1 = feedbackRepository.save(feedback);
		return feedback1;
	}

}
