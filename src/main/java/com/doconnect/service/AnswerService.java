package com.doconnect.service;

import java.util.List;

import com.doconnect.model.Answer;

public interface AnswerService {
	List<Answer> getAllAnswers();
	List<Answer> getAnswersByUser(Long user_id);
	List<Answer> getAnswersByQuestion(Long question_id);
	Answer getAnswerById(Long question_id);
}
