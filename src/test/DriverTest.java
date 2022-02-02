package gradle.java.p1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class DriverTest {

	// Tests correct number of cols in csv (2)
		@Test
		void correctNumCols() throws FileNotFoundException {
			// Get csv files
	        String fileName = "src/en_es_alphabet.csv";
	        File csvFile = new File(fileName);
	        Scanner sc = new Scanner(csvFile);

	        // skip first line
	        sc.next();

	        // verify each line splits into 2 parts (ie. 2 col inputs for each row)
	        while(sc.hasNext()){
	            //read single line, put in string
	            String[] line = sc.next().split(",");
	            assertTrue(line.length == 2);
	        }
	        // after loop, close scanner
	        sc.close();
		}
		
		// File intentionally made with a row having 4 cols
		@Test
		void wrongNumCols() throws FileNotFoundException {
			// Get csv file
	        String fileName = "src/incorrectNumCols.csv";
	        File csvFile = new File(fileName);
	        Scanner sc = new Scanner(csvFile);

	        // skip first line
	        sc.next();

	        // verify each line splits into 2 parts (ie. 2 col inputs for each row)
	        while(sc.hasNext()){
	            //read single line, put in string
	            String[] line = sc.next().split(",");
	            if(line.length > 2)
	            	assertFalse(line.length == 2);
	        }
	        // after loop, close scanner
	        sc.close();
		}
		
		// Provide csv having incorrect number of english letters
		@Test
		void wrongNumEnglishLetters() throws FileNotFoundException {
			// Get csv file
	        String fileName = "src/wrongNumLettersEnglish.csv";
	        File csvFile = new File(fileName);
	        Scanner sc = new Scanner(csvFile);

	        // skip first line
	        sc.next();

	        // verify english has incorrect number of letters
	        int numLetters = 0;
		    while(sc.hasNext()){
		        //read single line, put in string
		    	String line = sc.next();
		    	int commaIndex = line.indexOf(",");
		        String engLetter = line.substring(0, commaIndex);
		        if(engLetter.length() > 0)
		        	++numLetters;
		    }
		    
		    // English should have 26 letters, this file has 22
		    assertFalse(numLetters == 26);
		    assertEquals(numLetters, 22);
		    
	        // after loop, close scanner
	        sc.close();
		}
		
		// Provide csv with correct number of english letters
		@Test
		void correctNumEnglishLetters() throws FileNotFoundException {
			// Get csv file
	        String fileName = "src/en_es_alphabet.csv";
	        File csvFile = new File(fileName);
	        Scanner sc = new Scanner(csvFile);

	        // skip first line
	        sc.next();

	        // verify english has correct number letters

	        int numLetters = 0;
		    while(sc.hasNext()){
		        //read single line, put in string
		    	String line = sc.next();
		    	int commaIndex = line.indexOf(",");
		        String engLetter = line.substring(0, commaIndex);
		        if(engLetter.length() > 0)
		        	++numLetters;
		    }
		    
		    // English should have 26 letters, this file has 22
		    assertEquals(numLetters, 26);
		    
	        // after loop, close scanner
	        sc.close();
		}
		
		// Provide csv with wrong number of spanish letters
		@Test
		void wrongNumSpanishLetters() throws FileNotFoundException {
			// Get csv file
	        String fileName = "src/wrongNumLettersSpanish.csv";
	        File csvFile = new File(fileName);
	        Scanner sc = new Scanner(csvFile);

	        // skip first line
	        sc.next();

	        // verify spanish has incorrect num letters
	        int numLetters = 0;
		    while(sc.hasNext()){
		        //read single line, put in string
		    	String line = sc.next();
		    	int commaIndex = line.indexOf(",");
		        String spanLetter = line.substring(commaIndex + 1);
		        if(spanLetter.length() > 0)
		        	++numLetters;
		    }
		    
		    // Spanish should have 29 letters, this file has 26
		    assertFalse(numLetters == 29);
		    assertEquals(numLetters, 26);
		    
	        // after loop, close scanner
	        sc.close();
		}
		
		// Provide csv with correct number of Spanish letters
		@Test
		void correctNumSpanishLetters() throws FileNotFoundException {
			// Get csv file
	        String fileName = "src/en_es_alphabet.csv";
	        File csvFile = new File(fileName);
	        Scanner sc = new Scanner(csvFile);

	        // skip first line
	        sc.next();

	        // verify spanish has 29 letters
	        int numLetters = 0;
		    while(sc.hasNext()){
		        //read single line, put in string
		    	String line = sc.next();
		    	int commaIndex = line.indexOf(",");
		        String spanLetter = line.substring(commaIndex + 1);
		        if(spanLetter.length() > 0)
		        	++numLetters;
		    }
		    
		    // English should have 26 letters, this file has 22
		    assertEquals(numLetters, 29);
		    
	        // after loop, close scanner
	        sc.close();
		}


}
