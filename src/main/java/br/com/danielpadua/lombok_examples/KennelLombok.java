package br.com.danielpadua.lombok_examples;

import java.util.Set;
import lombok.Builder;
import lombok.Singular;

@Builder
public class KennelLombok {
	private Integer id;
	private String name;
	@Singular
	private Set<DogLombok> dogs;
}
