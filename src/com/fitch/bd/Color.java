package com.fitch.bd;

public class Color {
	
	private String color;
	private static final String gray = "GRAY";
	
	public Color(String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString(){
		return this.color;
	}
}
