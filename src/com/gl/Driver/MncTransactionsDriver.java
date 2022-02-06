package com.gl.Driver;


public class MncTransactionsDriver {
	
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;
	
	static class Node {
		int key, height;
		Node left, right;
		}
	
		// Utility function to create a new node
		static Node newNode(int data) {
			Node temp = new Node();
			temp.key = data;
			temp.height = 1;
			temp.left = null;
			temp.right = null;
			return temp;
		} 
	
	

	// Function to convert to right skewed tree	
	static void RightSkewedTree(Node root)	
	{
	
		// If we reach the lowest node
		if(root == null)
		{
			return;
		}	
		
		RightSkewedTree(root.left);
		
		Node rightNode = root.right;		
	
		// Condition to check if the root Node
		// of the skewed tree is not defined
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}	
		
		RightSkewedTree(rightNode);
		
	}

	static void preOrder(Node root) {
		if (root == null)
			return;
		else {
			System.out.print(root.key + " ");
			preOrder(root.left);				
			preOrder(root.right);				
			}
		}

	// Driver Code
	public static void main (String[] args)
	{
		
		// Create a tree
		Node root = newNode(50);		
		root.left = newNode(30);
		root.right = newNode(60);
		root.left.left = newNode(10);
		root.right.left= newNode(55);
		
		RightSkewedTree(root);
		System.out.println("Output");
		preOrder(headNode);
	}
}
