import java.util.*;

class StackImplementationArray{
  public static void main(String[] args){
    System.out.println("Hello World");
    StackADT<Integer> st=new StackADT<>(3);
    st.push(10);
    st.push(20);
    System.out.println(st.peek());
    st.printStack();
  }
}

class StackADT<T>{
  private T[] arr;
  private int top;
  private int size;
  
  @SuppressWarnings("unchecked")
  StackADT(int capacity){
    if(capacity<=0){
      throw new Error("Invalid Capacity to initialize stack");
    }
    this.top=-1;
    this.size=capacity;
    this.arr=(T[])new Object[capacity];//most imp line in Generic Stack
    Arrays.fill(this.arr,null); 
  }

  //push
  public void push(T data){
    if(top==size-1){
      throw new Error("StackOverflow");
    }
    this.arr[top+1]=data;
    top++;
  }

  //pop
  public T pop(){
    if(top==-1){
      throw new Error("StackUnderflow");
    }
    T val=this.arr[top];
    this.arr[top]=null;
    top--;
    return val;
  }


  //peek
  public T peek(){
    if(top==-1){
      throw new Error("StackUnderflow");
    }
    return this.arr[top];
  }

  //isEmpty
  public boolean isEmpty(){
    return top==-1;
  }
  public void printStack(){
    for(T i: arr){
      System.out.println(i==null ? "Empty pos":"Val is : "+i);
    }
  }
}