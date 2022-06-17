/******************************************************************************

Stack Implementation as Linked List:
1)Insertion/Deletion at the End:
  Time Complexity:O(n)
  
2)Insertion/Deletion at the beginning
  Time Complexity:O(1)

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
   
   public int pop(){
       if(head==null){
           System.out.println("Stack Underflow");
           return Integer.MIN_VALUE;
       }
       int data=head.data;
       head=head.next;
       return data;
   }
   
   public void printStack(Node temp){
       System.out.println("Stack: ");
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
       System.out.println();
   }
   
   public int top(){
       if(head==null){
           System.out.println("Stack Underflow");
           return Integer.MIN_VALUE;
       }
       return head.data;
   }
   
   public static void main(String args[]){
       Main stackAsLinkedlist= new Main();
       System.out.println(stackAsLinkedlist.pop()+" popped from stack");
       System.out.println("Topmost Element in stack: "+stackAsLinkedlist.top());
       stackAsLinkedlist.printStack(stackAsLinkedlist.head);
       stackAsLinkedlist.push(1);
       stackAsLinkedlist.printStack(stackAsLinkedlist.head);
       
       stackAsLinkedlist.push(2);
       stackAsLinkedlist.printStack(stackAsLinkedlist.head);
       
       System.out.println("Topmost Element in stack: "+stackAsLinkedlist.top());
       stackAsLinkedlist.push(3);
       stackAsLinkedlist.printStack(stackAsLinkedlist.head);
       
       stackAsLinkedlist.push(4);
       stackAsLinkedlist.printStack(stackAsLinkedlist.head);
       System.out.println("Topmost Element in stack: "+stackAsLinkedlist.top());
       System.out.println(stackAsLinkedlist.pop()+" popped from stack");
       stackAsLinkedlist.printStack(stackAsLinkedlist.head);
       System.out.println("Topmost Element in stack: "+stackAsLinkedlist.top());
   }
}




