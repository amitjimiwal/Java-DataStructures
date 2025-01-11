class Node {
    int data;
    Node next;
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

class Stack {
    Node head;
    Stack() { this.head = null; }

    // Function to check if the stack is empty
    boolean isEmpty() {
        return head == null;
    }

    //push
    void push(int new_data) {
        //insertion at front
        Node new_node = new Node(new_data);
        if (new_node == null) {
            System.out.println("\nStack Overflow");
            return;
        }
        new_node.next = head;
        head = new_node;
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("\nStack Underflow");
            return;
        }
        else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }
    int peek() {
        if (!isEmpty())
            return head.data;
        else {
            System.out.println("\nStack is empty");
            return Integer.MIN_VALUE;
        }
    }
}

public class StackImplementationUsingLL {
    public static void main(String[] args)
    {
        // Creating a stack
        Stack st = new Stack();

        // Push elements onto the stack
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        // Print top element of the stack
        System.out.println("Top element is " + st.peek());

        // removing two elemements from the top
          System.out.println("Removing two elements...");
        st.pop();
        st.pop();

        // Print top element of the stack
        System.out.println("Top element is " + st.peek());
    }
}