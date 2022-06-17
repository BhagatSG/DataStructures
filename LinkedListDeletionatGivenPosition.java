/******************************************************************************

Deletion of a node in a Linked List at a given position.

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
	    Node new_node=new Node(new_data);
	    new_node.next=head;
	    head=new_node;
	}
	
	public void printList(){
	    Node temp=head;
	    while(temp!=null){
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	    }
	    System.out.println();
	}
	
	public void deleteNodePosition(int position){
	    if(head==null){
	        return;
	    }
	    
	    Node temp=head;
	    
	    if(position==0){
	        head=temp.next;
	        return;
	    }
	    
	    for(int i=0;temp!=null && i<position-1;++i)
	       temp=temp.next;
	       
	    if(temp==null || temp.next==null)
	       return;
	     
	     Node next=temp.next.next;
	     
	     temp.next=next;
	}
	
	public static void main(String args[]){
	    Main llist=new Main();
	    
	    llist.push(5);
	    llist.push(4);
	    llist.push(3);
	    llist.push(2);
	    llist.push(1);
	    llist.push(0);
	    
	    llist.printList();
	    
	    llist.deleteNodePosition(3);
	    llist.printList();
	    
	    llist.deleteNodePosition(9);
	    llist.printList();
	}
	
}



