package com.doconnect.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="answers")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="a_id")
	private Long answerId;

	@Column(name="q_id")
	private Long questionId;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="is_approved")
	private Boolean isApproved;
	
	@Column(name="answer")
	@Lob()
	private String answer;
	
	@Column(name="created_time")
	private Timestamp createdAt;
}
