

public class Stack {
    Node head;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;


    }

    public int pop(){
        if(head == null){
            System.out.println("the stack is empty");
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public void peek(){
        if (head == null){
            System.out.println("the stack is empty");
        }
        System.out.println(head.data);
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void printStack(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data);
            current = current.next;
        }
    }

}
