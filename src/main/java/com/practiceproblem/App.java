package com.practiceproblem;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Find Maximum Problem Using Generics");
		CalculateMaximum maxObj = new CalculateMaximum();
		int max = maxObj.maxNumber(11, 79, 66);
		maxObj.maxAtSecondPosition(79, max);
		
		String maximum=maxObj.maxOfString("Apple", "Peach", "zebra");
		maxObj.maxAtSecondPosition("Peach", maximum);
		
		maxObj.maxAtSecond(66,maxObj.maxOfGerneric(55,66,11));
	}
	
}
