package com.janhvi;

public class StringMethodDemo {
	
	public static void main(String[] args) {
		String text = "Hello Java world";
		System.out.println("Orignal String:" + text);
		System.out.println("Length :" + text.length());
		System.out.println("UpperCase:" + text.toUpperCase());
		System.out.println("LowerCase:" + text.toLowerCase());
		System.out.println("Character at index 4:" + text.charAt(4) );
		System.out.println("Contain 'java':" + text.contains("Java"));
		System.out.println("Start with 'hello' :" + text.startsWith("Hello"));
		System.out.println("End with 'hello':" + text.endsWith("World"));
		System.out.println("Index of 'java':" + text.indexOf("Java"));
		System.out.println("Last index od 'o':" + text.lastIndexOf("o"));
		System.out.println("Substring(6):" + text.substring(6));
		System.out.println("Substring(6,10):" + text.substring(6,10));
		String s1 = "Java";
		String s2 = "Java";
		System.out.println("Equals:" +s1.equals(s2));
		System.out.println("Replace:" + text.replace("java","Python"));
		System.out.println("Is equal :" + text.isEmpty());
		String fruit = "Apple,Mango,Banana";
		String[] arr = fruit.split(",");
		System.out.println("Split Result:");
		for(String fruits : arr) {
			System.out.println(fruit);
		}
		String joined = String.join("-","Java","Python","C++");
		System.out.println("Join:" + joined);
		System.out.println("Repeat:" + "Hi".repeat(3));
	}

}
