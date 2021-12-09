package com.qa.lambdasstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		List<String> animalList = Arrays.asList("cat", "dog", "fish");
		Stream<String> animalStream = animalList.stream();
		
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> numbersStream = numbersList.stream();
			
		// forEach
		numbersStream.forEach(number -> System.out.println(number));
		
		// filter (intermediate operation)
		animalStream.filter(animal -> animal.contains("a")).forEach(animal -> System.out.println(animal));
		
		// map (intermediate operation)
		animalStream.map(animal -> animal.toUpperCase()).forEach(animal -> System.out.println(animal));
		
		// collectors (terminal operation)
		List<String> myNewAnimalList = animalStream.map(animal -> animal.toUpperCase()).collect(Collectors.toList());
		System.out.println(myNewAnimalList);
		
		// reduce (terminal operation)
		int sum = numbersStream.reduce((num1, num2) -> num1 + num2).get();
		System.out.println(sum);
	}
}
