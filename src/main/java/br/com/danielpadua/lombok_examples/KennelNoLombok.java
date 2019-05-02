package br.com.danielpadua.lombok_examples;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class KennelNoLombok {
	private Integer id;
	private String name;
	private Set<DogNoLombok> dogs;
	
	public KennelNoLombok(Integer id, String name, Set<DogNoLombok> dogs) {
		this.id = id;
		this.name = name;
		this.dogs = dogs;
	}			

	public static KennelBuilder builder() {
		return new KennelBuilder();		
	}
	
	public static class KennelBuilder {
		private Integer id;
		private String name;
		private HashSet<DogNoLombok> dogs;
		
		KennelBuilder() {			
		}
		
		public KennelBuilder id(Integer id) {
			this.id = id;
			return this;
		}
		
		public KennelBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public KennelBuilder dog(DogNoLombok dog) {
			if (this.dogs == null) {
				this.dogs = new HashSet<DogNoLombok>();
			}
			this.dogs.add(dog);
			return this;
		}
		
		public KennelBuilder dogs(Collection<? extends DogNoLombok> dogs) {
			if (this.dogs == null) {
				this.dogs = new HashSet<DogNoLombok>();
			}
			this.dogs.addAll(dogs);
			return this;
		}
		
		public KennelBuilder clearDogs() {
			if (this.dogs != null) {
				this.dogs.clear();
			}			
			return this;
		}
		
		public KennelNoLombok build() {
			Set<DogNoLombok> dogs = Collections.unmodifiableSet(this.dogs);
			return new KennelNoLombok(this.id, this.name, dogs);
		}

		@Override
		public String toString() {
			return "KennelBuilder [id=" + id + ", name=" + name + ", dogs=" + dogs + "]";
		}			
	}	
}
