import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    void play() {
        ArrayStack<Integer> stack = new ArrayStack<>(15);
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

class ArrayStack<T> implements Stack<T> {
    int size;
    int top = -1;
    private T[] stack;

    ArrayStack() {
        size = 100;
//        Class<T> tClass = (Class<T>) ((T) getClass()
//                .getGenericSuperclass());
        stack = (T[]) Array.newInstance(Object.class, size);
    }

    ArrayStack( int size) {
        this.size = size;
        stack = (T[]) Array.newInstance(Object.class, size);
    }

    @Override
    public void push(T value) {
        if (top>= size-1) return;
        top++;
        stack[top] = value;
    }

    @Override
    public T pop() {
        if (top == -1) return null;
        top --;
        return stack[top + 1];
    }

    @Override
    public T getTop() {

        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}