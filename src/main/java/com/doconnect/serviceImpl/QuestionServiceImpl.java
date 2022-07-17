package com.doconnect.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import com.doconnect.model.Question;
import com.doconnect.repository.QuestionRepository;
import com.doconnect.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository; 
	
	@Override
	public List<Question> getAllQuestions() {
		return questionRepository.findAll();
	}

	@Override
	public List<Question> getQuestionsByUser(Long user_id) {
		Question exampleQuestion = Question.builder()
				.uId(user_id).build();
		ExampleMatcher userIdMatcher = ExampleMatcher.matching()
				.withMatcher("user_id", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("q_id", "is_approved", "question", "created_time");
		Example<Question> userIdExample = Example.of(exampleQuestion, userIdMatcher);
		return questionRepository.findAll(userIdExample);
	}

	@Override
	public Question getQuestionById(Long question_id) {
		Optional<Question> question = questionRepository.findById(question_id);
		return question.isPresent() ? question.get() : null;
	}

}
