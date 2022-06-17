/******************************************************************************

Deletion of the first occurence of the key in the Linked List.

*******************************************************************************/
public class Main
{
	Node head;
	
	static class Node{
	    int data;
	    Node next;
	    Node(int d){
	        data=d;
	        next=null;
	    }
	}
	public void printList(){
	    Node temp=head;
	    while(temp!=null){
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	    }
	    System.out.println();
	}
	
	public void push(int new_data){
	    Node new_node=new Node(new_data);
	    new_node.next = head;
	    head=new_node;
	}
	
	public void deleteNode(int key){
	    Node temp=head, prev=null;
	    
	    if(temp!=null && temp.data == key){
	        head=temp.next;
	        return;
	    }
	    
	    while(temp!=null && temp.data!=key){
	        prev=temp;
	        temp=temp.next;
	    }
	    
	    if(temp==null)
	     return;
	     
	     prev.next=temp.next;
	}
	
	public static void main(String args[]){
	    Main llist = new Main();
	    
	    llist.push(2);
	    llist.push(4);
	    llist.push(3);
	    llist.push(1);
	    llist.push(5);
	    
	    llist.printList();
	    
	    llist.deleteNode(4);
	    llist.printList();
	    
	    llist.deleteNode(0);
	    llist.printList();
	}
}


