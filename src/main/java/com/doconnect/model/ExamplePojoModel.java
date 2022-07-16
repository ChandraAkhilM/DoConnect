package com.doconnect.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@ToString
//@Setter
//@AllArgsConstructor
@Data
@AllArgsConstructor
public class ExamplePojoModel {
	private String var1;
	private Integer var2;
	private List<Integer> var3;
}
