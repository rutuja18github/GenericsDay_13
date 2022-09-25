package com.practiceproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateMaximum {
	private static final Logger logger = LogManager.getLogger(CalculateMaximum.class);

	// determines the largest of three Comparable integer objects
	public int maxNumber(int num1, int num2, int num3) {
		Integer max = Integer.valueOf(num1); // initially assign num1 to max
		if (Integer.valueOf(num2).compareTo(max) > 0) {
			max = num2; // num2 is the largest
		}
		if (Integer.valueOf(num3).compareTo(max) > 0) {
			max = num3; // num3 is the largest
		}
		return max;

	}
    //check that maximum(largest) number is present at second position
	public void maxAtSecondPosition(int num, int max) {
		if (num == max) {
			logger.info("Calculated maximum is at 2nd position");
		} else {
			logger.info("Calculated maximum is not at 2nd position");

		}
	}

}
