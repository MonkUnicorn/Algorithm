import java.io.*;

class queue {
    private int a[];
    private int size;
    private int front;
    private int rear;

    queue(int s) {
        a = new int [s];
        size = s;
        front = rear = -1;
    }

    int isEmpty() {
        if ((front == -1) && (rear == -1))
            return 1;
        else 
            return 0;
    }

    int isFull() {
        if (rear == size -1)
            return 1;
        else 
            return 0;
    }

    void enque(int x) {
        if (isEmpty() == 1) {
            front = rear = 0;
            a[rear] = x;
        }
        else if (isFull() == 1) {
                System.out.println("Queue is full");
        }
        else {
                 rear++;
                a[rear] = x;
            }
        }
    

    int deque() {
        
        if(isEmpty() == 1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            int x = a[front];
            if (front == rear) {
                front = rear = -1;
            }
            else {
                front++;
            }
            return x;
        }
    }

    public static void main(String args[]) throws IOException
    {
        queue var1 = new queue(5);

      var1.deque();
      var1.enque(10);
      var1.enque(20);
      var1.enque(30);
      var1.enque(40);
      var1.enque(50);
      var1.enque(60);
      System.out.println(var1.deque());
      System.out.println(var1.deque());
      System.out.println(var1.deque());
      System.out.println(var1.deque());
      System.out.println(var1.deque());
      System.out.println(var1.deque());
    }
}
 