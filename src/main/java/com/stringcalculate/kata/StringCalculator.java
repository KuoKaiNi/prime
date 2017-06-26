package com.stringcalculate.kata;

public class StringCalculator {

	public int add(String numbers) throws RuntimeException {
		int result = 0;
		
		if (numbers.isEmpty()){
			return result;
		}
		
		String split = ",";
		
		if (numbers.indexOf("//") == 0){
			split = numbers.substring(2, 3);
			numbers = numbers.substring(3);
		}
		
		numbers = numbers.replaceAll("\n", split);
		
		valideInput(numbers);
		
		String[] args = numbers.split(split);
		
		for (String parameter : args){
			
			if (parameter.isEmpty()){
				parameter = "0";
			}
			
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
