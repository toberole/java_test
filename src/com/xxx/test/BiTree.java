package com.xxx.test;

class TreeNode {
	public int data;
	public TreeNode lchild;
	public TreeNode rchild;
}

/**
 * ������
 */
public class BiTree {
	public TreeNode root;

	/**
	 * �������һ���������Ĺ���
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
	 * ����
	 */
	void midOrder(TreeNode node) {
		if (null != node) {
			midOrder(node.lchild);

			System.out.print(node.data + "  ");

			midOrder(node.rchild);
		}
	}

	/**
	 * ǰ��
	 */
	void preOrder(TreeNode node) {
		if (null != node) {
			System.out.print(node.data + "  ");

			preOrder(node.lchild);
			preOrder(node.rchild);
		}
	}

	/**
	 * ����
	 */
	void postOrder(TreeNode node) {
		if (null != node) {
			postOrder(node.lchild);
			postOrder(node.rchild);

			System.out.print(node.data + "  ");
		}
	}
}
