package Array;

import java.util.Stack;

public class ValidStackSequences {
    public boolean validStackSequences(int[] pushed, int[] popped){
        Stack<Integer> stack = new Stack<>();
        int push_len = pushed.length;
        int i = 0;
        for(int n : pushed){
            stack.push(n);
            while(!stack.isEmpty() && i < push_len && stack.peek() == popped[i]){
                i++;
                stack.pop();
            }
        }
        return i == push_len;
    }

    public static void main(String[] args) {
        ValidStackSequences valid = new ValidStackSequences();
        int[] pushed = new int[]{1,2,3,4,5};
        int[] popped = new int[]{4,3,5,1,2};
        System.out.println(valid.validStackSequences(pushed, popped));
    }
}
