package javacollection;

public class ScratchLL {
    Node head;
    Node currNode;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
//    Add Data in Linked list form first;
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

//    Add Data in Linked List from Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
            currNode.next = newNode;
    }

//    Print Linked List
    public void printList(){
        if(head == null){
            System.out.println("This list is Empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> " );
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        ScratchLL list = new ScratchLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.printList();
    }
}
