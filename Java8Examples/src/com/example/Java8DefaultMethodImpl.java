package com.example;

public class Java8DefaultMethodImpl implements Java8DefaultMethod {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Java8DefaultMethod java8 = new Java8DefaultMethodImpl();
		java8.getMessage();
		System.out.println(java8.defaultMehtod());

	}
}
