package top100.no155;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MinStack {
    private Deque<Integer> stack = new LinkedList<Integer>();
    private Deque<Integer> minStack = new LinkedList<Integer>();

    public MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stack.push(val);
        minStack.push(Math.min(minStack.peek(),val));
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */