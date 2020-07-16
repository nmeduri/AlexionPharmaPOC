package com.alexion.utils;

import org.apache.log4j.Logger;

public class Logs {
    public static final String ASTRIC_DESIGN ="****************************************************************************************";
	// Initialize Log4j logs
	static Logger Log = Logger.getLogger(Logs.class.getName());//
    	
	// This is to print log for the beginning of the test case, as we usually run so
	// many test cases as a test suite
    
	public static void startTestCase(String sTestCaseName) {

		Log.info(ASTRIC_DESIGN);

		Log.info(ASTRIC_DESIGN);

		Log.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");

		Log.info(ASTRIC_DESIGN);
		
		Log.info(ASTRIC_DESIGN);

	}

	// This is to print log for the ending of the test case

	public static void endTestCase(String sTestCaseName) {

		Log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + sTestCaseName+ "           XXXXXXXXXXXXXXXXXXXXXX");

		Log.info("X");

		Log.info("X");

		Log.info("X");

		Log.info("X");

	}

	public static void info(String message) {

		Log.info(message);
      }
}