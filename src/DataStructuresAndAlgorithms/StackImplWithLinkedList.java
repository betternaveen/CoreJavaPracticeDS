package DataStructuresAndAlgorithms;

public class StackImplWithLinkedList {

    // the first node

    private Node head;

    class Node {
        int value;
        Node next;
    }

    public StackImplWithLinkedList(){
        head = null;
    }

    public int pop(){
        if(head == null){
            System.out.println("stack is empty");
            return -1;
        }
        else {
            int value = head.value;
            head = head.next;
            System.out.println("popped element is : "+ value);
            return value;
        }
    }

    public void push( int value) {
        Node oldhead = head;
        head = new Node();
        head.value = value;
        head.next = oldhead;
    }

    public static void main(String[] args) {
        StackImplWithLinkedList siwll = new StackImplWithLinkedList();

        siwll.push(500);
        siwll.push(400);
        siwll.push(300);
        siwll.push(200);
        siwll.push(100);
        siwll.pop();
        siwll.pop();
        siwll.pop();
        siwll.pop();
        siwll.pop();
        siwll.pop();
    }
}
