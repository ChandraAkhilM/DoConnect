package com.doconnect.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "questions")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "q_id")
	private Long questionId;

	@Column(name = "q_user_id")
	private Long uId;

	@Column(name = "q_is_approved")
	private Boolean isApproved;

	@Column(name = "q_question")
	@Lob()
	private String question;

	@Column(name = "q_created_time")
	private Timestamp questionCreatedAt;
 
	@ManyToOne
	private User user;
	
	@OneToMany
	private List<Answer> answers = new ArrayList<>(); 

	@Override
	public String toString() {
		return "Question : [ Id: " + questionId + ", userId: " + uId + ", created_time: " + questionCreatedAt
				+ ", is_qpproved:" + isApproved + " ]";
	}
}
