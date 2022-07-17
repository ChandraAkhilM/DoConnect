package com.doconnect.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "u_id")
	private Long userId;

	@Column(name = "u_user_name")
	private String userName;

	@Column(name = "u_role")
	private String role;

	@Column(name = "u_email")
	private String email;

	@OneToOne
	private Password password;

	@OneToMany(mappedBy = "uId")
	private List<Question> questions = new ArrayList<>();
	
	@OneToMany(mappedBy = "uId")
	private List<Answer> answers = new ArrayList<>();

	@Override
	public String toString() {
		return "User : [ Id: " + userId + ", user name: " + userName + ", email: " + email + " ]";
	}
}
