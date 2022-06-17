/******************************************************************************

Infix to Postfix Conversion:

*******************************************************************************/
public class Main
{
	Node head;
	
	static class Node{
	    char data;
	    Node next;
	    
	    Node(char d){
	        data=d;
	        next=null;
	    }
	}
	
	public void push(char new_data){
	    Node new_node=new Node(new_data);
	    new_node.next=head;
	    head=new_node;
	}
	
	public char pop(){
	    if(head==null){
	        System.out.println("Stack Undeflow");
	        return 	'\0';
	    }
	    char data=head.data;
	    head=head.next;
	    return data;
	}
	
	public char top(){
	    if(head==null){
	        System.out.println("Stack Undeflow");
	        return 	'\0';
	    }
	    return (head.data);
	}
	
	public boolean isEmpty(){
	    if(head==null){
	        return true;
	    }else{
	        return false;
	    }
	}
	
	public static int Prec(char c){
	    switch(c){
	        case '+':
	        case '-':
	            return 1;
	        case '*':
	        case '/':
	            return 2;
	        case '^':
	            return 3;     
	    }
	    return -1;
	}
	
	public static String infixToPostfix(String exp){
	    Main stack=new Main();
	    String result = "";
	    for(int i=0;i<exp.length();++i){
	        char c=exp.charAt(i);
	        
	        if(Character.isLetterOrDigit(c))
	         result+=c;
	        else if(c=='(')
	         stack.push(c);
	        else if(c==')'){
	            while(!stack.isEmpty() && stack.top()!='(')
	              result+=stack.pop();
	              
	             if(!stack.isEmpty() && stack.top()!='(')
	               return "Invalid Expression";
	             else 
	               stack.pop();
	        }else{
	            while(!stack.isEmpty() && Prec(c)<=Prec(stack.top())){
	                if(stack.top()=='(')
	                 return "Invalid Expression";
	                else
	                 result+=stack.pop();
	            }
	            stack.push(c);
	        }
	    }
	    while(!stack.isEmpty()){
	        if(stack.top()=='(')
	          return "Invalid Expression";
	         result+=stack.pop();
	    }
	    return result;
	}
	
	public static void main(String args[]){
	    String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(infixToPostfix(exp)); 
	}
	
	
}

