package main.java.com.gozdesy.l25_optionals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class OptionalExample {

	//boş bir empty optional nesnesi yarattık. 
	@Test
	void whenCreateEmptyOptional_thenCorrect() {
		
		Optional<String> empty = Optional.empty();
		assertFalse(empty.isPresent());
	}
	
	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
		
		String name = "Java";
		Optional <String > option = Optional.of(name);
		System.out.println(option);
		assertTrue(option.isPresent());
	}

}
