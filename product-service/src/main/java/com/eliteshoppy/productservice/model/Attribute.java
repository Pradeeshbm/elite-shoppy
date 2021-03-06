package com.eliteshoppy.productservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document(collection = "attribute")
@Data @AllArgsConstructor
public class Attribute {
	
	@Id
	private String id;
	
	private String name;
	private List<String> values;

}
