package br.com.danielpadua.lombok_examples;

import lombok.Value;

@Value
public class DogCreateRequest {
	String name;
	String breed;
}
