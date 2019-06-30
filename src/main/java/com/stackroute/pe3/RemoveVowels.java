package com.stackroute.pe3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class RemoveVowels {
	
	//	method remove small case vowels from a word
	public void removeVowel(String ...input) {
	
//		declaration
		char[] word;
		int i = 0;
		String letter = "";
		
//		check vowels in each word and removes it
		for (String str:input) {
			while(str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u")){
				if (str.contains(letter="a")||str.contains(letter="e")||str.contains(letter="i")
						||str.contains(letter="o")||str.contains(letter="u")) {
					
					int p = str.indexOf(letter);
					str = str.substring(0, p) + str.substring(p + 1);   //removes the vowel character
					
				}
			}
			System.out.println("Place Name without Vowels:"+i+" "+str);
			i++;
		}
	}
}

