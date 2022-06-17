/******************************************************************************

Linkedlist Reversing

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
	public void push(int new_data){
	    Node new_node= new Node(new_data);
	    new_node.next=head;
	    head=new_node;
	}
	public void printList(Node temp){
	    while(temp!=null){
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	    }
	    System.out.println();
	}
	
	public Node reverseList(Node head){
	    Node prev=null;
	    Node current=head;
	    Node next=null;
	    while(current!=null){
	        next=current.next;
	        current.next=prev;
	        prev=current;
	        current=next;
	    }
	    head=prev;
	    return head;
	}
	
	public static void main(String args[]){
	    Main llist=new Main();
	    
	    llist.push(5);
	    llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        
        llist.printList(llist.head);
        llist.head=llist.reverseList(llist.head);
        llist.printList(llist.head);
	}
}
