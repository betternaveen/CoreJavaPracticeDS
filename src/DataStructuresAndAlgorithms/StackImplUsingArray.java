package DataStructuresAndAlgorithms;

public class StackImplUsingArray {
    int size;
    int arr[];
    int top;

    StackImplUsingArray(int size){

        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return arr.length == size -1;
    }

    public int peek(){
        if(!isEmpty()){
            return arr[top];
        }
        else
            return -1;
    }

    public void pop(){
        if(!isEmpty()){
            int popEleSize = top;
            System.out.println("Popped element :" +arr[popEleSize]);
            top--;
        }
        else
            System.out.println("Stack is empty");
    }

    public void push(int element){
        if(!isFull()){
            top++;
            arr[top] = element;
            System.out.println("Pushed element is : "+element);
        }
        else
            System.out.println("Stack is full");
    }


    public static void main(String[] args) {
        StackImplUsingArray stackImplUsingArray = new StackImplUsingArray(10);
        stackImplUsingArray.pop();

        stackImplUsingArray.push(100);
        stackImplUsingArray.push(200);
        stackImplUsingArray.push(300);
        stackImplUsingArray.pop();
        System.out.println(stackImplUsingArray.peek());
    }

}
