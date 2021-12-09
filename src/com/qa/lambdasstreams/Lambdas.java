package com.qa.lambdasstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {

	public void printElements(String element) {
		System.out.println(element);
	}

	public static void main(String[] args) {
		// Method 1
		ArrayList<String> myListOne = new ArrayList<>();

		// Method 2
		List<String> myOtherList = new ArrayList<>();
		myOtherList.add("Cat");
		myOtherList.add("Dog");
		myOtherList.add("Fish");

		// Method 3
		List<String> myOtherOtherList = Arrays.asList("Cat", "Dog", "Fish");

		// Method 4
		List<String> myList = List.of("Cat", "Dog", "Fish", "Caterpillar");

		// forEach w/ Lambda
		myList.forEach(element -> {
			System.out.println(element);
		});

		// forEach w/ some Logic
		myList.forEach(element -> {
			if (element.contains("a")) {
				System.out.println(element);
			}
		});		

	}
}
