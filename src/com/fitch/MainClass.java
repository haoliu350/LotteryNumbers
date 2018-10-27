package com.fitch;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> finalNumbers = new ArrayList<String>();
		while(finalNumbers.size() < 5){
			int temp = generateRandomNumber(69);
			if(!finalNumbers.contains(temp+"")){
				finalNumbers.add(temp + "");	
			}
			
		}
		for(String s : finalNumbers){
			System.out.println("White Ball: " + s);
		}
		System.out.println("Red Ball: " + generateRandomNumber(26));
	}
	
	public static int generateRandomNumber(int range){
		return (int)(java.lang.Math.random() * range);
	}

}
