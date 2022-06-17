/******************************************************************************

Inserting a node:

Node can be inserted in a linked list:
1)at the front of the linked list
           push() method. Time Complexity: O(1)
2)after a given node
           insertAfter() method. Time Complexity: O(1)
2)at the end of the linked list
           append() method. Time Complexity: O(n)

*******************************************************************************/
public class Main
{
    Node head;
    
    static class Node{
        String data;
        Node next;
        
        Node(String d){
           data=d;
           next=null;
        }
    }
    
    public static void main(String args[]){
        Main llist = new Main();
        llist.append("Ghugtyal");
        llist.printList(llist.head);
        
        llist.push("Bhagat");
        llist.printList(llist.head);
        
        llist.append("Learn");
        llist.printList(llist.head);
        
        llist.append("DS");
        llist.printList(llist.head);
        
        llist.insertAfter(llist.head.next,"Please");
        llist.printList(llist.head);
    }
    
    public void printList(Node last){
        while(last!=null){
            System.out.print(last.data+" ");
            last=last.next;
        }
        System.out.println();
    }
    
    public void push(String new_data){
        Node new_node = new Node(new_data);
        
        new_node.next=head;
        
        head=new_node;
    }
    
    public void insertAfter(Node prev_node,String new_data){
        if(prev_node == null){
            System.out.println("Cannot be inserted after");
            return;
        }
        
        Node new_node = new Node(new_data);
        
        new_node.next=prev_node.next;
        
        prev_node.next= new_node;
    }
    
    public void append(String new_data){
        Node new_node = new Node(new_data);
        
        if(head == null){
            head = new_node;
            return;
        }
        
        //new_node.next=null;
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=new_node;
    }
	
}




