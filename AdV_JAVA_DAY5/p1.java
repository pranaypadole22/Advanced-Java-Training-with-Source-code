package AdV_JAVA_DAY5;
//Implementation of stack by manual method.
public class p1 {
    int stk[];
    final int size=10;
    int top;
    public p1(){
        top=-1;
        stk=new int [size];
    }
    public void push(int v){
        if(isfull()){
            System.out.println("Stack is full");
        }else {
            stk[++top]=v;
        }
    }
    public int pop(){
        int v=-1;
        if (isempty()){
            System.out.println("Stack empty");
        }else{
            v=stk[top--];
        }
        return v;
    }
    public  boolean isfull(){
        if(top==size-1){
            return true;
        }else {
            return false;
        }
    }
    public boolean isempty(){
        if (top==-1) {
            return true;
        }
            else{
                return false;
        }

    }
    public static void main(String[] args) {
p1 stack=new p1();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
