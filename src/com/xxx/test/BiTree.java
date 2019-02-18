package com.xxx.test;

class TreeNode {
	public int data;
	public TreeNode lchild;
	public TreeNode rchild;
}

/**
 * 二叉树
 */
public class BiTree {
	public TreeNode root;

	/**
	 * 插入就是一个创建树的过程
	 */
	void insert(int data) {
		TreeNode newNode = new TreeNode();
		newNode.data = data;
		if (root == null) {
			root = newNode;
			return;
		}
		
		TreeNode curNode = root;
		TreeNode parentNode = null;

		while (curNode != null) {
			parentNode = curNode;
			if (curNode.data > data) {
				curNode = curNode.lchild;
				if (curNode == null) {
					parentNode.lchild = newNode;
					return;
				}
			} else {
				curNode = curNode.rchild;
				if (curNode == null) {
					parentNode.rchild = newNode;
					return;
				}
			}
		}
	}

	/**
	 * 中序
	 */
	void midOrder(TreeNode node) {
		if (null != node) {
			midOrder(node.lchild);

			System.out.print(node.data + "  ");

			midOrder(node.rchild);
		}
	}

	/**
	 * 前序
	 */
	void preOrder(TreeNode node) {
		if (null != node) {
			System.out.print(node.data + "  ");

			preOrder(node.lchild);
			preOrder(node.rchild);
		}
	}

	/**
	 * 后序
	 */
	void postOrder(TreeNode node) {
		if (null != node) {
			postOrder(node.lchild);
			postOrder(node.rchild);

			System.out.print(node.data + "  ");
		}
	}
}
