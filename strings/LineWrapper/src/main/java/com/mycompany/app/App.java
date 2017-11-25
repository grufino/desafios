package com.mycompany.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App{
	
    public static void main( String[] args ){
    	FileReader inputFile = null;
		try {
			inputFile = new FileReader("inputFile");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
    	
    	BufferedReader bufferedReader = new BufferedReader(inputFile);
    	
    	String inputString = "";
    	String line = "";
    	
    	try {
			while((line = bufferedReader.readLine()) != null) {
			    inputString += line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}   

    	AbstractWrapper app1 = new MaxLengthLine(inputString, 40);
    	
    	AbstractWrapper app2 = new Justification(inputString, 40);

    	System.out.println(app1.getTextFull());
    	
    	System.out.println(app2.getTextFull());
    	
    	
    	
    }
}
