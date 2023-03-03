import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

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

    String infixToPostFix(String infix) {
        StringBuilder postfix = new StringBuilder();
        StringBuilder number = new StringBuilder();
        Stack<Character> operators = new LinkedListStack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println("char is digit : "+ch);
                number.append(ch);
                if (i<infix.length()-1)
                continue;
            }
            postfix.append(number);
            postfix.append(' ');
            System.out.println("added number : "+ number.toString()+" postfix = "+ postfix.toString()+" char = "+ch+" :: i = "+i);
            number.setLength(0);
            switch (ch){
                case '+':
                case '-':
                case '*':
                case '/': {
                    System.out.println("there's op "+ch);
                    if (operators.isEmpty()) {
                        operators.push(ch);
                        break;
                    }
                    System.out.println("there's op "+ch + "top = "+operators.getTop()+" should pop " +shouldPop(operators.getTop(),ch));
                    if (shouldPop(operators.getTop(),ch)) {
                        postfix.append(operators.pop());
                        operators.push(ch);
                        break;
                    }
                    operators.push(ch);
                    System.out.println("added operator : "+operators.getTop());
                    break;
                }
                default:
            }
            while (!operators.isEmpty()&&i==infix.length()-1){
                postfix.append(operators.pop());
                postfix.append(" ");
            }
            System.out.println("finished at "+postfix);
        }
        return postfix.toString();
    }

    //give it stacktop then char;
    private boolean shouldPop(char stackTop, char operation) {
        if (stackTop==operation)return true;
        return getOperationOrder(stackTop)>=getOperationOrder(operation);
    }

    private int getOperationOrder(char operation) {
        switch (operation) {
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
        }
        return 0;
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
        newValue.next = top;
        top = newValue;
    }

    @Override
    public T pop() {
        if (top == null) return null;
        T last = top.value;
        top = top.next;
        return last;
    }

    @Override
    public T getTop() {
        return top.value;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
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

