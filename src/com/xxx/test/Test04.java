package com.xxx.test;

import java.util.HashMap;

public class Test04 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("hello", "world");
		String vString = map.get("hello");
	}
}
