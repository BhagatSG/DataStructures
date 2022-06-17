//LinkedList Creation & Traversal
class Main{
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
        Main llist= new Main();
        
        llist.head = new Node("Bhagat");
        Node second = new Node("Test");
        Node third = new Node("Ghugtyal");
        
        llist.head.next = second;
        second.next = third;
        
        llist.printList(llist.head);
    }
    
    public void printList(Node temp){
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

