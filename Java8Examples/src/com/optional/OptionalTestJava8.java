package com.optional;

import java.util.Optional;

public class OptionalTestJava8 {
	public static void main(String[] args) {
		String s = null;
		Optional<String> opt = Optional.ofNullable(s);
		opt.ifPresent(str -> System.out.println(str));
		
		System.out.println("orElse value "+opt.orElse("No value"));
		System.out.println("orElseGet value "+opt.orElseGet(()->"kkkkkkk"));

		

		if (opt.isPresent()) {
			System.out.println("String optional ");
		} else {
			System.out.println("Empty optional " + opt.isPresent());

		}
	}

}
