import java.util.Arrays;

import java.util.*;


public class StackImplementationUsingLL{
  public static void main(String[] args) {
    StackLL<Integer> st=new StackLL<>();
    st.push(10);
    st.push(20);
    st.pop();
    st.printStack();
    System.out.println(st.peek());
  }
}
// Node definition
class Node<T>{
  T data;
  Node<T> next;
  Node(T d){
    this.data=d;
    this.next=null;
  }
  Node(T d, Node<T> neighbour){
    this.data=d;
    this.next=neighbour;
  }
}

class StackLL<P>{
  private Node<P> top; //head of linkedlist
  StackLL(){
    this.top=null;
  }

  //push
  public void push(P data){
    Node<P> node=new Node<>(data);
    if(top==null){ //empty stack
      this.top=node;
      return;
    }

    //insert at front
    node.next=this.top;
    this.top=node;
  }

  //pop

  public P pop(){
    if(this.top==null){ //empty stack
      throw new Error("StackUnderflow");
    }

    Node<P> temp=this.top;
    this.top=temp.next;
    temp.next=null;
    return temp.data;
  }

  //isEmpty

  public boolean isEmpty(){
    return this.top==null;
  }

  //peek
  public P peek(){
    if(this.top==null){
      throw new Error("StackUnderFlow");
    }
    return this.top.data;
  }


  //printStack
  public void printStack(){
    Node<P> temp=this.top;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println();
  }
}