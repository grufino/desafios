package com.mycompany.app;

import java.util.List;

public abstract class AbstractWrapper {
	String[] words;
	int size;
	int qtySpaces;
	
	public AbstractWrapper (String text, int size){
		this.words = text.split(" ");
		this.size = size;
	}
	
	public abstract List<String> lineEdit();
	
	public String getTextFull (){
		List lines = lineEdit();
    	String output = "";
    	for(int i = 0; i < lines.size();i++){
    		output += lines.get(i) + "\n";
    	}
    	return output;
    }
}
