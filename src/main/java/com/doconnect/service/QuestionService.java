package com.doconnect.service;

import java.util.List;

import com.doconnect.model.Question;

public interface QuestionService {
	List<Question> getAllQuestions();
	List<Question> getQuestionsByUser(Long user_id);
	Question getQuestionById(Long question_id);
}