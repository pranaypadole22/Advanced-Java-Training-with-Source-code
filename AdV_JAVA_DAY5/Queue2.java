package AdV_JAVA_DAY5;
//Impelement queue using stack.
import java.util.Stack;
public class Queue2 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    // Enqueue operation (push to stack1)
    public void enqueue(int x) {
        stack1.push(x);
    }
    // Dequeue operation (costly)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    // Peek front of queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public static void main(String[] args) {
        Queue2 q = new Queue2();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        q.enqueue(40);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

