
import java.util.Arrays;

public class StackImplementationArray {
     public static void main(String[] args) {
          try {
               Stack ss = new Stack(10);
               System.out.println(ss.isEmpty());
               ss.push(10);
               ss.push(9);
               ss.push(9);
               ss.push(9);
               ss.push(9);
               ss.push(9);
               ss.push(10);
               ss.pop();
               ss.push(12);
               ss.push(10);
               ss.push(10);
               ss.push(10);
               ss.pop();
               System.out.println(ss.isEmpty());
               ss.printStack();
          } catch (Error e) {
               System.out.println(e.getMessage());
          }
     }
}

class Stack {
     int size;
     int[] arr;

     int top = -1;

     Stack(int ss) {
          if (ss <= 0) {
               System.out.println("Cannot Create empty array , throwing err");
               throw new Error("Invalid size for Stack");
          }
          this.size = ss;
          this.arr = new int[ss];
          Arrays.fill(arr, -1);
     }

     // push
     public void push(int val) {
          if (top + 1 == this.size) {
               throw new Error("Stack OverFlow");
          }

          // put and push
          this.arr[top + 1] = val;
          top++;
     }

     // pop

     public void pop() {
          if (top == -1) {
               throw new Error("Stack UnderFlow");
          }

          // remove val
          arr[top] = -1;
          top--;
     }

     public void printStack() {
          for (int x : this.arr) {
               System.out.println(x == -1 ? "Empty pos" : "Val: " + x);
          }
     }

     public boolean isEmpty() {
          return top == -1;
     }
}
