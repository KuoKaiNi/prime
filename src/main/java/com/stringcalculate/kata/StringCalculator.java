package com.stringcalculate.kata;

public class StringCalculator {

	public int add(String numbers) throws RuntimeException {
		int result = 0;
		
		if (numbers.isEmpty()){
			return result;
		}
		
		numbers = numbers.replaceAll("\n", ",");
		
		valideInput(numbers);
		
		String[] args = numbers.split(",");
		
		for (String parameter : args){
			result += Integer.parseInt(parameter);
		}
		
		return result;
	}

	private void valideInput(String numbers) {
		if (numbers.indexOf(",,") >= 0){
			throw new RuntimeException("the  input is NOT ok");
		}
	}

}
