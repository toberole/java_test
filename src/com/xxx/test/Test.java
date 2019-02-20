package com.xxx.test;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Map;
import java.util.Random;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Test {
	public static void main(String[] args) {
		System.out.println("hello world\n");
		MathOP mathOP = (int a, int b) -> a + b;

		int res = mathOP.op(2, 5);
		System.out.println("res: " + res);
		
//		BitSet bitSet = new BitSet();
//		bitSet.get(0)
		
		Map<String, String> datas = null;

		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scr = scriptEngineManager.getEngineByName("");
		Base64.getDecoder().decode("");
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);

		new Thread(() -> {
			System.out.println("lambda ±Ì¥Ô Ω");
		}).start();

		ArrayList names = new ArrayList();

		names.add("Google");
		names.add("Runoob");
		names.add("Taobao");
		names.add("Baidu");
		names.add("Sina");

		names.forEach(System.out::println);

		System.out.println();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private interface MathOP {
		int op(int a, int b);
	}
}