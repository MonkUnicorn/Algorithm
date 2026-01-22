import java.io.*;

class stack 
{
    private int a[];
    private int size;
    private int top;

    stack (int x) {
        a = new int [x];
        size = x;
        top = -1;
    }

    int isEmpty() {

        if (top == -1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    int isFull() {

        if (top == size-1) {
            return 1;
        }

        else {
            return 0;
        }
    }

    int peek() {
        if (isEmpty() == 0) {
            return a[top];
        }
        else
            return -1;
    }

    void push(int x) {
        if(isFull() == 1) {
            System.out.println("Stack is full");
        }
        else 
            a[++top] = x;
    }

    void pop() {
        if (isEmpty() == 1)
            System.out.println("Stack is Empty");
        else 
            top--;
    }

    public static void main(String[] args) {
        
        stack s = new stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());

        s.pop();
        System.out.println(s.peek());

        s.pop();
        System.out.println(s.peek());

        s.pop();
        System.out.println(s.peek());

        s.pop();


    }
}