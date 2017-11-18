package com.stringcalculate.kata;

public class StringCalculator {

	private String split = ",";
	
	
	private String parserEmptyString(String numbers){
		if (numbers.isEmpty()){
			numbers = "0";
		}
		return numbers;
	}
	
	private String setupDefaultSplit(String numbers){
		if (numbers.indexOf("//") == 0){
			split = numbers.substring(2, 3);
			numbers = numbers.substring(3);
		}
		return numbers;
	}
	
	public int add(String numbers) throws RuntimeException {
		numbers = parserEmptyString(numbers);
		numbers = setupDefaultSplit(numbers);
		numbers = numbers.replaceAll("\n", split);
		valideInput(numbers);
		String[] args = numbers.split(split);
		return doCalculate(args);
	}
	
	private int doCalculate(String[] args){
		int result = 0;
		for (String parameter : args){
			parameter = parserEmptyString(parameter);				
			result += Integer.parseInt(parameter);
		}
		return result;
	}

	private void valideInput(String numbers) {
		if (numbers.indexOf(",,") >= 0){
			throw new RuntimeException("the input is NOT ok");
		}
	}

}
