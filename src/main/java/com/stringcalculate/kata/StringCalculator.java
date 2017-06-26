package com.stringcalculate.kata;

public class StringCalculator {

	public int add(String numbers) {
		int result = 0;
		
		if (numbers.isEmpty()){
			return result;
		}
		
		String[] args = numbers.split(",");
		
		for (String parameter : args){
			result += Integer.parseInt(parameter);
		}
		
		return result;
	}

}
