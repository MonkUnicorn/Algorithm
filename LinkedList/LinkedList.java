import java.io.*;

class Node {

    int data;
    Node next;

    Node(int x) {
        data=x;
        next=null;
    }
}

public class LinkedList{

    Node head;

     void insertAtEnd (int x) {

        Node temp = new Node(x);
        if(head==null) {
            head=temp;
        }
        else {
            Node t = head;
            while(t.next != null) {
                t=t.next;
            }
            t.next=temp;
        }
    }

    void print () {
        Node t = head;

        while(t != null) {
            System.out.print(t.data + " -> ");
            t=t.next;
        }
    }

    void insertAtMid (int pos, int x) {

        Node temp = new Node (x);

        if (pos ==0) {
            temp.next = head;
            head = temp;
        }

        else {

            Node t = head;

            while (pos > 1 && t.next != null) {
                pos --;
                t = t.next;
            }

            temp.next = t.next;
            t.next = temp;
        }
    }

    void deletionAtPosition (int pos) {
        Node t = head;
        Node prev = null;

        if (head == null) {
            System.out.println("List is Empty");
        }

        if (head!= null && pos == 0) {
            head = head.next;
        }

        else {

            while (pos >= 1 && t != null) {
                pos --;
                prev = t;
                t = t.next;
            }
             prev.next = t.next;
        }
    }

    public static void main(String args[]) {

        LinkedList l1 = new LinkedList();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);

        l1.print();
        System.out.println();

        // l1.insertAtMid(3, 50);

        // l1.print();
        // System.out.println();

        l1.deletionAtPosition(0);
        l1.deletionAtPosition(1);

        l1.print();

        // LinkedList l2 = new LinkedList();

        // l2.insertAtMid(0,10);
        // l2.insertAtMid(1, 20);
        // l2.insertAtMid(2, 30);
        // l2.insertAtMid(3, 40);

        // l2.print();
    }
}