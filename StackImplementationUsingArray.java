/******************************************************************************

Stack:
1)Linear Data Structure.

2)Stack follows LIFO Principle:
L:Last
I:IN 
F:First
O:OUT 

3)Insertion & Deletion happens at the same end.

Basic Operations peformed on Stack:
1)push(): 
        Adds an item to the stack.
        if the stack is full,the it is said to be "STACK OVERFLOW".

2)pop():
        Removes an item from the stack.
        if the stack is empty, then it is said to be "STACK UNDEFLOW".
        
3)top()/peek():
        returns top element of the stack.
        
4)isEmpty():
        returns true if stack is empty else returns false.
        

Time Complexity:
All stack operations push(),pop() & top() have time complexity O(1).

Applications of Stack in real-life:
1)Balancing of symbols
2)infix to postfix/prefix conversion
3)Forward & Backward features in web browsers.

Implementation:
1)Using Array
2)Using LinkedList

*******************************************************************************/
public class Main
{
	static final int MAX=1000;
	int top;
	int a[]=new int[MAX];
	
	Main(){
	    top=-1;
	}
	
	public boolean isEmpty(){
	    return (top<0);
	}
	
	public int top(){
	    if(top<0){
	        System.out.println("Stack Underflow");
	        return Integer.MIN_VALUE;
	    }else{
	        int x=a[top];
	        return x;
	    }
	}
	public void push(int data){
	    if(top>=MAX-1){
	        System.out.println("Stack Overflow");
	    }else{
	        a[++top]=data;
	        System.out.println(data+" pushed into the stack");
	    }
	}
	
	public int pop(){
	    if(top<0){
	        System.out.println("Stack Undeflow");
	        return Integer.MIN_VALUE;
	    }else{
	        int x=a[top--];
	        return x;
	    }
	}
	public static void main(String args[]){
	    Main stackAsArray=new Main();
	    
	    if(stackAsArray.isEmpty()){
	       System.out.println("Stack is Empty"); 
	    }else{
	        System.out.println("Stack is not Empty");
	    }
	    
	    System.out.println("Topmost element of stack: "+stackAsArray.top());
	    
	    stackAsArray.push(1);
	    stackAsArray.push(2);
	    if(stackAsArray.isEmpty()){
	       System.out.println("Stack is Empty"); 
	    }else{
	        System.out.println("Stack is not Empty");
	    }
	    stackAsArray.push(3);
	    System.out.println("Topmost element of stack: "+stackAsArray.top());
	    
	    stackAsArray.push(4);
	    System.out.println("Topmost element of stack: "+stackAsArray.top());
	    System.out.println(stackAsArray.pop()+" popped from the stack");
	    System.out.println("Topmost element of stack: "+stackAsArray.top());
	}
}

