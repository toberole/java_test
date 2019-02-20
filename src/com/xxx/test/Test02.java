package com.xxx.test;

import java.lang.Thread.State;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public class Test02 {

	static void select_sort(int arr[]) {
		int len = arr.length;

		int min_pos = -1;

		for (int i = 0; i < len; i++) {
			min_pos = i;

			for (int j = i; j < len; j++) {
				if (arr[min_pos] > arr[j]) {
					min_pos = j;
				}
			}

			if (min_pos != i) {
				int temp = arr[min_pos];
				arr[min_pos] = arr[i];
				arr[i] = temp;
			}
		}
	}

	static void test_select_sort() {
		int arr[] = new int[] { 1, 5, 3, 6 };

		select_sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	static class Node {
		public Object data;
		public Node next;
	}

	// ͷ�巨
	static void test_List1(Node header) {
		for (int i = 0; i < 10; i++) {
			Node node = new Node();
			node.data = i;

			node.next = header.next;
			header.next = node;
		}
	}

	// β�巨
	static void test_List2(Node header) {
		Node pre = header;
		for (int i = 0; i < 10; i++) {
			Node node = new Node();
			node.data = i;
			
			pre.next = node;
			pre = node;
		}
	}
	
	static void test_List() {
		Node header = new Node();
		test_List1(header);
		header = header.next;
		while (header != null) {
			System.out.print(header.data + "  ");

			header = header.next;
		}
		
		System.out.println("\r\n+++++++++++++++++++++++++++++++++++++++\r\n");
		
		Node header2 = new Node();
		test_List2(header2);
		header2 = header2.next;
		while (header2 != null) {
			System.out.print(header2.data + "  ");

			header2 = header2.next;
		}
	}
	
	static void quick_sort(int arr[],int start,int end) {
		if (start<end) {
			
		}
	}
	
	static long fib(int n) {
		if (n==1) {
			return 1;
		}else if (n==2) {
			return 2;
		}else {
			long res = 0;
			long a = 1;
			long b = 2;
			for (int i = 2; i < n; i++) {
				res = a+b;
				a = b;
				b = res;
			}
			
			return res;
		}
	}
	


	public static void main(String[] args) {
		
		long res = fib(5);
		System.out.println("fib n = 4 ,res = "+res);
		
		ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<>();
		cMap.put("hello", "world");
		cMap.get("hello");
		
		Vector<Integer> vector = new Vector<>();
		vector.add(0);
	}
}
