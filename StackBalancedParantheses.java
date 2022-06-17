/******************************************************************************

Balanced Parantheses in an Expression.

*******************************************************************************/

class Main{
    
    static class Stack{
        static final int MAX=100;
        int top;
        char a[]=new char[MAX];
        
        Stack(){
            top=-1;
        }
        
        public void push(char data){
            if(top>=MAX-1){
                System.out.println("STACK OVERFLOW");
            }else{
                a[++top]=data;
            }
        }
        
        public boolean isEmpty(){
            return (top<0);
        }
        
        public char pop(){
            if(top<0){
                System.out.println("STACK UNDERFLOW");
                return '\0';
            }else{
                char x=a[top--];
                return x;
            }
        }
        
    }
    
    static boolean isMatchingPair(char character1,char character2){
        if(character1=='{' && character2=='}')
          return true;
        else if(character1=='[' && character2==']')
          return true;
        else if(character1=='(' && character2==')')
          return true;
        else 
          return false;
    }
    
    static boolean areParanthesesbalanced(char exp[]){
        Stack stack=new Stack();
        
        for(int i=0;i<exp.length;++i){
            if(exp[i]=='{' || exp[i]=='[' || exp[i]=='('){
                stack.push(exp[i]);
            }
            
            if(exp[i]=='}' || exp[i]==']' || exp[i]==')'){
                if(stack.isEmpty()){
                    return false;
                }
                
                if(!isMatchingPair(stack.pop(),exp[i])){
                    return false;
                }
            }
        }
        if(stack.isEmpty())
         return true;
        else 
         return false;
    }
    
    public static void main(String args[]){
        char exp[] = {'{','(',')','}','[',']'};
        if(areParanthesesbalanced(exp)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
        
        char exp2[] = {'{','(','}','[',']'};
        if(areParanthesesbalanced(exp2)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
        
    }
    
}



