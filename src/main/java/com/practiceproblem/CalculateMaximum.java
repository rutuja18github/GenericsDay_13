package com.practiceproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateMaximum {
	private static final Logger logger = LogManager.getLogger(CalculateMaximum.class);

	// find the largest of three Comparable integer objects
	public int maxNumber(int num1, int num2, int num3) {
		Integer max = Integer.valueOf(num1); // initially assign num1 to max
		if (Integer.valueOf(num2).compareTo(max) > 0) {
			max = num2; // num2 is the largest
		}
		if (Integer.valueOf(num3).compareTo(max) > 0) {
			max = num3; // num3 is the largest
		}
		return max;//return largest object

	}

	// check that maximum(largest) number is present at second position
	public void maxAtSecondPosition(int num, int max) {
		if (num == max) {
			logger.info("Calculated maximum number is at 2nd position");
		} else {
			logger.info("Calculated maximum number is not at 2nd position");

		}
	}
	
	// find the largest of three Comparable String objects
	public String maxOfString(String... strings) {
		String max = strings[0];    // initially assign String present 0th position to max variable
		for (String string : strings) {
			if (string.compareTo(max) > 0) {
				max = string;
			}
		} 
		return max;//return largest object
	}
	
	// check that maximum(largest) String is present at second position
	public void maxAtSecondPosition(String str, String max) {
		if (str.equals(max)) {
			logger.info("Calculated maximum String is at 2nd position");
		} else {
			logger.info("Calculated maximum string is not at 2nd position");

		}
	}
	// find the largest of three Comparable generic objects
	public  <T extends Comparable<T>> T maxOfGerneric(T ...variables) {
	    T max = variables[0];//
	    for (T variable : variables) {
	        if (variable.compareTo(max) > 0) {
	            max = variable;
	        }
	    }
	    return max;//return largest object
	}
	
	// check that maximum(largest) element is present at second position
	public static <T> void maxAtSecond(T element,T max){
        if(element.equals(max)){
        	logger.info("Calculated maximum is at 2nd position");
        }else{
        	logger.info("Calculated maximum is not at 2nd position");
        }
     }
}
