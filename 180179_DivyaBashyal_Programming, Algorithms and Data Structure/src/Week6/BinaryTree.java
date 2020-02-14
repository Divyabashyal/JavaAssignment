package Week6;
        
public class BinaryTree {

	public static void main(String[] args) {
		  Node root = null;  
		    root = insertNode(root, 20);  
		           insertNode(root, 400);  
		           insertNode(root, 140);  
		           insertNode(root, 100);  
		           insertNode(root, 60);  
		           insertNode(root, 120);  
		           insertNode(root, 80); 
		 Inorder(root);  

	}
	
	static class Node {  
		int num;  
	    Node left, right;  
	};  
	static Node insertNode(Node root, int num)  
	{  
	   
	    Node insert = insert(num);  
	    
	    
	    Node RootValue = root;  
	     
	    Node value = null;  
	    
	    while (RootValue != null) {  
	        value = RootValue;  
	        if (num < RootValue.num)  
	            RootValue = RootValue.left;  
	        else
	            RootValue = RootValue.right;  
	    }  
	  
	    if (value == null)  
	        value = insert;  
	    
	    else if (num < value.num)  
	        value.left =insert;  
	    
	    
	    else
	        value.right =insert;  
	    
	   
	    return value;  
	}  
	
	static Node insert(int data)  
	{  
		 
	    Node input = new Node();  
	    
	    input.num = data;  
	    
	    input.left = null;  
	    input.right = null;  
	    
	    return input;  
	} 
	 
	static void Inorder(Node root)  
	{  
	    if (root == null)  
	        return;  
	    else {  
	        Inorder(root.left);  
	        System.out.print( root.num +" ");  
	        Inorder(root.right);  
	    }  
	}  
	    


}
