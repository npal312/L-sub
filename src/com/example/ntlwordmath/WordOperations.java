package com.example.ntlwordmath;

import com.example.num2let.WordMap;


public class WordOperations {
	private WordMap wMap;
	
	public WordOperations(WordMap wMap) {
        this.setwMap(new WordMap());
    }
	
	public WordMap getwMap() {
		return wMap;
	}

	public void setwMap(WordMap wMap) {
		this.wMap = wMap;
	}
	
	public String add(String word1, String word2) {
		//– Adds the numeric values of the two words and returns the result as a word.
		return "";
	}
	public String subtract(String word1, String word2) {
		//– Subtracts the numeric value of the second word from the first and returns the result.
		return "";
	}
	public String multiply(String word1, String word2) {
		//– Multiplies the numeric values of the two words and returns the result as a word.
		return "";
	}
	public String divide(String word1, String word2) {
		//– Divides the numeric value of the first word by the second and returns the result.
		return "";
	}
	public void setWordMap(WordMap wMap) {
		//– Allows users to choose the letter mapping system.
	}


}
