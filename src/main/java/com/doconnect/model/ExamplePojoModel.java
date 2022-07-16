package com.doconnect.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class ExamplePojoModel {
	@Id
	private String var1;
	private Integer var2;
	private Boolean var3;
}
