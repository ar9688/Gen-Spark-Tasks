class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }

}

class LinkedList{
    Node head;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head== null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;

        }
        current.next = newNode;
    }
    public void printList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
    public void deleteNode(int target){
        if(head.data == target){
            return;
        }
        Node prev = null;
        Node current = head;
        while (current!=null && current.data!= target){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
    }


}

class Main{
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.printList();
        System.out.println("after deletion");
        ll.deleteNode(2);
        ll.printList();



    }
}


