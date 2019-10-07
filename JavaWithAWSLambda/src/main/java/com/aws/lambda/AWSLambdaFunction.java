package com.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class AWSLambdaFunction implements RequestHandler<String, String> {

	public String handleRequest(String input, Context context) {
		context.getLogger().log("Input " + input);
		return input;
	}

}
