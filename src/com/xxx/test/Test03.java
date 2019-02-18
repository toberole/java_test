package com.xxx.test;

public class Test03 {
	public static void main(String[] args) {
		BiTree biTree = new BiTree();
		biTree.insert(10);
		biTree.insert(1);
		biTree.insert(11);
		
		biTree.midOrder(biTree.root);
		System.out.println();
		biTree.preOrder(biTree.root);
		System.out.println();
		biTree.postOrder(biTree.root);
	}
}
