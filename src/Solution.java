import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    void play() {
        Stack<Integer> stack = new LinkedListStack<>();
//        stack.stack[0]=8;
        stack.push(981);
        stack.push(2500);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(5);
        System.out.println(stack.getTop());
    }
}

interface Stack<T> {
    void push(T value);

    T pop();

    T getTop();

    boolean isEmpty();
}

class LinkedListStack<T> implements Stack<T> {
    Node<T> top;

    LinkedListStack() {
        top = null;
    }

    @Override
    public void push(T value) {
        Node<T> newValue = new Node<>(value);
        if (top == null) {
            top = newValue;
            return;
        }
        newValue.next=top;
        top=newValue;
    }

    @Override
    public T pop() {
        if(top==null)return null;
        T last = top.value;
        top=top.next;
        return last;
    }

    @Override
    public T getTop() {
        return top.value;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }
}

class Node<T> {
    T value;
    Node<T> next;

    public Node() {
        value = null;
        next = null;
    }

    public Node(T value) {
        this.value = value;
        next = null;
    }

}

