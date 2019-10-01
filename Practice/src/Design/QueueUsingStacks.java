package Design;

import java.util.Stack;

/*
* Here we have to implement queue using stack. We know queue is a FIFO DS and a stack is LIFO DS.
* Therefore, we will be needing 2 stacks to maintain the FIFO property.
* stack1 will be our main stack(Queue, in this case) and stack2 will be needed as a secondary DS to maintain FIFO.
* */

public class QueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!stack1.isEmpty()){
            int elem = stack1.pop();
            stack2.push(elem);
        }
        int answer = stack2.pop();
        while(!stack2.isEmpty()){
            int elem = stack2.pop();
            stack1.push(elem);
        }
        return answer;
    }

    /** Get the front element. */
    public int peek() {
        while(!stack1.isEmpty()){
            int elem = stack1.pop();
            stack2.push(elem);
        }
        int answer = stack2.peek();
        while(!stack2.isEmpty()){
            int elem = stack2.pop();
            stack1.push(elem);
        }
        return answer;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}
