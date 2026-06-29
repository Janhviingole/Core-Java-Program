package com.janhvi;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> studs = new HashSet<String>();
		LinkedHashSet<String> studss = new LinkedHashSet<String>();
		studs.add("rahul");
		studs.add("amit");
		studs.add("rahul");
		studs.add("vinit");
		System.out.println(studs);
		studss.add("rahul");
		studss.add("amit");
		studss.add("rahul");
		studss.add("vinit");
		System.out.println(studss);
	}

}
