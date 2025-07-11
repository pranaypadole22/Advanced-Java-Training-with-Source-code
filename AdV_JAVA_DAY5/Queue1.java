package AdV_JAVA_DAY5;
public class Queue1 {
    final int size = 10;
    int front, rear;
    int q[];
    public Queue1() {
        front = rear = -1;
        q = new int[size];
    }
    public void add(int v) {
        if (isfull()) {
            System.out.println("Queue is full");
        } else {
            q[++rear] = v;
            if (front == -1) {
                front = 0;
            }
        }
    }
    public int del() {
        int v = -1;
        if (isempty()) {
            System.out.println("Queue is empty");
        } else {
            v = q[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
        return v;
    }
    public boolean isfull() {
        return rear == size - 1;
    }
    public boolean isempty() {
        return front == -1;
    }
    // Optional: Display queue
    public void display() {
        if (isempty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        System.out.println("Deleted: " + q.del());
        q.display();
    }
}
