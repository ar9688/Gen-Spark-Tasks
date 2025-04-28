public class Queue {
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
    }

    public void delete(){
        if(head == null){
            System.out.println("the queue is empty");

        }
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next!=null){
            current = current.next;
        }
        current.next = current.next.next;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }


}
