package com.eliteshoppy.productsearchservice.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ProductAttribute {

	private String name;
	private List<String> values;
}
