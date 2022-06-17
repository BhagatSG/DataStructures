/******************************************************************************

Prefix & Postfix Expression Evaluation Algorithm:

23*54*+9-

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
	
	public void push(int data){
	    Node new_node= new Node(data);
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
	
	public int top(){
	    if(head==null){
	        System.out.println("Stack Underflow");
	        return Integer.MIN_VALUE;
	    }
	    return head.data;
	}
	public static int peformArithmeticOperation(String operator,int op1,int op2){
	    int output=0;
	    switch(operator){
	        case "*":
	            output=op1*op2;
	            break;
	        case "+":
	            output=op1+op2;
	            break;
	        case "-":
	            output=op1-op2;
	            break;
	    }
	    return output;
	}
	public static int evaluatePostfix(String exp){
	    Main stackEvalExp=new Main();
	    
	    for(int i=0;i<exp.length();++i){
	        String val=Character.toString(exp.charAt(i));
	        
	        
	        if(!(val.equalsIgnoreCase("*") || val.equalsIgnoreCase("+") || val.equalsIgnoreCase("-") || val.equalsIgnoreCase("/"))){
	          stackEvalExp.push(Integer.parseInt(val));
	        }else{
	            int op2=stackEvalExp.pop();
	            int op1=stackEvalExp.pop();
	            int res=peformArithmeticOperation(val,op1,op2);
	            stackEvalExp.push(res);
	        }
	    }
	    return (stackEvalExp.top());
	}
	
	public static void main(String args[]){
	    String exp="23*54*+9-";
	    int result=evaluatePostfix(exp);
	    System.out.println("Result= "+result);
	}
}



