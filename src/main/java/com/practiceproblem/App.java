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
		int max = maxObj.maxNumber(11, 10, 66);
		maxObj.maxAtSecondPosition(79, max);
	}
	
}
