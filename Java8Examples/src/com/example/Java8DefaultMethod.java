package com.example;

public interface Java8DefaultMethod {

	String getMessage();

	default String defaultMehtod() {
		return "Default mehtod implementation is ready";
	}
}
