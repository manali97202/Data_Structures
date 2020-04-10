package stack;
public class Stack {
    private int array[];
    private int top;
    private int capacity;
    Stack(int capacity){
        this.array=new int[capacity];
        this.capacity=capacity;
        this.top=-1;
    }
    public int push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
    return array[++top]=item;
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }
    public int peek(){
        return array[top];
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    
    public static void main(String[] args) {
        Stack ss=new Stack(5);
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);
        ss.push(6);
        System.out.println(ss.peek());
        ss.pop();
        ss.pop();
        ss.pop();
        ss.pop();
        System.out.println(ss.pop());
        
        

        
        
    }
    
}
