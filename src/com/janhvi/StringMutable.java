package com.janhvi;

public class StringMutable {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		sb.append("Programming");
		sb.insert(0,"Learn");
		sb.replace(6, 10,"Core");
		sb.delete(0, 6);
		sb.reverse();
		System.out.println(sb);
	}

}
