package com.doconnect.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "answers")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "a_id")
	private Long answerId;

	@Column(name = "a_q_id")
	private Long qId;

	@Column(name = "a_user_id")
	private Long uId;

	@Column(name = "a_is_approved")
	private Boolean isApproved;

	@Column(name = "a_answer")
	@Lob()
	private String answer;

	@Column(name = "a_created_time")
	private Timestamp answerCreatedAt;

	@ManyToOne
	private User user;
	
	@ManyToOne
	private Question question;

	@Override
	public String toString() {
		return " Answer : [ id: " + answerId + ", question id: " + qId + ", user id: " + uId + ", is approved: "
				+ isApproved + ", created at: " + answerCreatedAt + " ]";
	}
}
