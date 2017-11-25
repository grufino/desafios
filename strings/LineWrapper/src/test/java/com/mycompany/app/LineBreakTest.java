package com.mycompany.app;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class LineBreakTest extends TestCase{
	
	String input;
	String output1;
	String output2;
	
	AbstractWrapper test;
	
    public LineBreakTest( String testName ){
        super( testName ); 
        try {
			this.input = new String(Files.readAllBytes(Paths.get("inputFile")));
			this.output1 = new String(Files.readAllBytes(Paths.get("output_parte1.txt")));
			this.output2 = new String(Files.readAllBytes(Paths.get("output-parte2.txt")));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public static Test suite(){
        return new TestSuite( LineBreakTest.class );
    }
    
    public void testFull(){
    	test = new MaxLengthLine(input, 40);
    	test.lineEdit();
    	assertEquals(output1, test.getTextFull());
    	
    }

    public void testFullJustify(){
    	test = new Justification(input, 40);
    	test.lineEdit();
    	assertEquals(output2, test.getTextFull());
    	    	//Está diferente, porém também funciona!!!
    }

}
