package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

//import org.apache.commons.lang3.StringUtils;

public class MaxLengthLine extends AbstractWrapper {

	
    public MaxLengthLine(String text, int size) {
		super(text, size);
	}

	public List<String> lineEdit() {
        
    	List<String> lines = new ArrayList<String>();
        int index = 0;
        for (int i = 0; i < words.length - index; i++){
        	String curLine = "";
        while((curLine + words[index]).length() <= size){
        	curLine += words[index] + " ";
        	index++;
        }

        curLine = curLine.substring(0, curLine.length()-1);
        lines.add(curLine);
        }
        
    	String curLine = "";
        while(index < words.length){
        	curLine += words[index] + " ";
        	index++;
        }

        curLine = curLine.substring(0, curLine.length()-1);
        lines.add(curLine);
		return lines;

    }
    
    
    
    
    
}