package com.doconnect.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import com.doconnect.model.Answer;
import com.doconnect.model.Question;
import com.doconnect.repository.AnswerRepository;
import com.doconnect.service.AnswerService;

public class AnswerServiceImpl implements AnswerService{
	
	@Autowired
	AnswerRepository answerRepository;

	@Override
	public List<Answer> getAllAnswers() {
		return answerRepository.findAll(); 
	}

	@Override
	public List<Answer> getAnswersByUser(Long user_id) {
		Answer exampleAnswer = Answer.builder()
				.userId(user_id).build();
		ExampleMatcher userIdMatcher = ExampleMatcher.matching()
				.withMatcher("user_id", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("a_id", "is_approved", "q_id", "created_time", "answer"));
		Example<Answer> userIdExample = Example.of(exampleAnswer, userIdMatcher);
		return answerRepository.findAll(userIdExample);
	}

	@Override
	public List<Answer> getAnswersByQuestion(Long question_id) {
		Answer exampleAnswer = Answer.builder()
				.userId(question_id).build();
		ExampleMatcher questionIdMatcher = ExampleMatcher.matching()
				.withMatcher("q_id", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("a_id", "is_approved", "user_id", "created_time", "answer"));
		Example<Answer> questionIdExample = Example.of(exampleAnswer, questionIdMatcher);
		return answerRepository.findAll(questionIdExample);
	}

	@Override
	public Answer getAnswerById(Long answer_id) {
		Optional<Answer> answer = answerRepository.findById(answer_id);
		return answer.isPresent() ?
				answer.get() : null;
	}
	
}
