package prime.util;

import java.util.ArrayList;
import java.util.List;



public class PrimeUtil {

	private static boolean isDivisible(int molecular, int denominator){
		if (molecular%denominator == 0){
			return true;
		}
		return false;
	}
	
	public static java.util.List<Integer> getPrime(int data) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i = 2; i <= data; i ++){
			while (isDivisible(data, i)){
				result.add(i);
				data = data / i;
				if (data < 2) break;
			}
		}
		
		return result;
	}

}
