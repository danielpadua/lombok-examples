package br.com.danielpadua.lombok_examples;

import lombok.Data;
import lombok.NonNull;

@Data
public class DogLombok {
	@NonNull
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private String breed;
}
