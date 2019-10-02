package com.example;

import java.util.function.ToIntFunction;

public class TestDemo implements ToIntFunction<String> {

	@Override
	public int applyAsInt(String value) {
		// TODO Auto-generated method stub
		return Integer.parseInt(value);
	}
	
	public static void main(String[] args) {
		ToIntFunction ss = new TestDemo();
		int i = ss.applyAsInt("2");
		System.out.println(i);
	}

}
