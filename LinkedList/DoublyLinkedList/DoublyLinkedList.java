import java.io.*;

class Node {
    int data; 
    Node next;
    Node prev;

    Node (int x) {
        data = x;
        next = prev = null;
    }
}
public class DoublyLinkedList {
    
    Node head = null;

    void insertAtEnd(int x ) {

     Node temp = new Node (x);

     if (head == null) {
        head = temp;
     }

     else 
     {
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
        temp.prev = t;
     }
    }

    void insertAtPos(int x, int pos) {

        Node temp = new Node (x);

        if (pos == 0) {
            temp.next = head;
            head.prev = temp;
            head = temp;
            return;
        }
        
        Node t = head;

        while (t != null && pos > 1) {
            pos --;
            t = t.next;
        }

        if (t != null && t.next != null) {
            temp.next = t.next;
            temp.prev = t;
            t.next = temp;
            temp.next.prev = temp;
        }

        else {
        System.out.println("Position not found");
        }
    }

    void deletionByValue (int x) {

        Node t = head;

        while (t != null && t.data != x) {
            t = t.next;
        }

        if (t.prev == null) {  // First element
            head = head.next;
            head.prev = null;
            return;
        }

        if (t != null && t.next != null) {  // Middle Element
            t.prev.next = t.next;
            t.next.prev = t.prev;
            return;
        }

        if (t != null && t.next == null) {  // Last Element
            t.prev.next = null; 
            return;
        }

    }

    void print() {

        if (head != null) {

            Node t = head;

            while (t != null) {
                System.out.print(t.data + "->");
                t = t.next;
            }
        }
    }

    public static void main(String[] args) {
        
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd(50);
        dll.insertAtEnd(60);

        dll.print();
        System.out.println();

        dll.insertAtPos(100, 0);
        dll.insertAtPos(200, 1);
        dll.insertAtPos(300, 3);

        dll.print();
        System.out.println();

        dll.deletionByValue(100);
        dll.deletionByValue(300);
        dll.deletionByValue(50);

        dll.print();
    }
}
