package Week5;

public class RemoveDuplicates {
	 Node head; 
	   
	    class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) {data = d; next = null; } 
	    } 
	  
	    void removeDuplicates() 
	    { 
	        
	        Node current = head; 
	        while (current != null) { 
	             Node temp = current; 
	            while(temp!=null && temp.data==current.data) { 
	                temp = temp.next; 
	            } 
	            current.next = temp; 
	            current = current.next; 
	        } 
	    } 
	                      
	   
	    public void push(int new_data) 
	    { 
	        
	        Node new_node = new Node(new_data); 
	   
	     
	        new_node.next = head; 
	   
	      
	        head = new_node; 
	    } 
	  
	   
	     void printList() 
	     { 
	         Node temp = head; 
	         while (temp != null) 
	         { 
	            System.out.print(temp.data+" "); 
	            temp = temp.next; 
	         }   
	         System.out.println(); 
	     } 
	    public static void main(String args[]) 
	    { 
	        RemoveDuplicates llist = new RemoveDuplicates(); 
	        llist.push(2); 
	        llist.push(2); 
	        llist.push(7); 
	        llist.push(5); 
	        llist.push(5); 
	        llist.push(5);
                llist.push(3);
                llist.push(0);
	          
	        llist.removeDuplicates(); 
	          
	        System.out.println("List after removal of duplicate elements"); 
	        llist.printList(); 
	    } 
}
