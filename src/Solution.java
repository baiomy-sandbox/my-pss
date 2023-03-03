import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Solution {
    String infixToPostFix(String infix) {
        StringBuilder postfix = new StringBuilder();
        StringBuilder number = new StringBuilder();
        Stack<Character> operators = new LinkedListStack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if(Character.isDigit(ch)){
                number.append(ch);
                if (i<infix.length()-1)
                continue;
            }
            if (!number.isEmpty()){
            postfix.append(number);
            postfix.append( ' ');}
            number.setLength(0);
            switch (ch){
                case '(':
                    operators.push('(');
                    break;
                case ')':{
                    char pop= operators.pop();
                   while (pop!='('&&!operators.isEmpty()){
                       postfix.append(pop);
                       postfix.append(' ');
                       pop=operators.pop();
                   }
                   break;
                }
                case '+':
                case '-':
                case '*':
                case '/': {
                    if (operators.isEmpty()) {
                        operators.push(ch);
                        break;
                    }
                    if (shouldPop(operators.getTop(),ch)) {
                        postfix.append(operators.pop());
                        postfix.append(' ');
                        operators.push(ch);
                        break;
                    }
                    operators.push(ch);
                    break;
                }
                default:
            }
            while (!operators.isEmpty()&&i==infix.length()-1){
                postfix.append(operators.pop());
                postfix.append(" ");
            }
        }

        return postfix.toString().trim();
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

