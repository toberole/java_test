package com.xxx.test;

import java.util.Vector;

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
	


	public static void main(String[] args) {
		test_List();
		
		Vector<Integer> vector = new Vector<>();
		vector.add(0);
	}
}
