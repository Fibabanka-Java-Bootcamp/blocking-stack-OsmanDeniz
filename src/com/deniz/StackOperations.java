package com.deniz;

import java.util.Stack;

public class StackOperations<T> {
    static Stack stack;

    public StackOperations() {
        stack = new Stack();
    }

    synchronized T popOperation() {
        return (T) stack.pop();
    }

    synchronized T peekOperation() {
        return (T) stack.peek();
    }

    synchronized void pushOperation(T val) {
        stack.push(val);
    }
}
