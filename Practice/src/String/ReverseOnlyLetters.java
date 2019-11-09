package String;

import java.util.Stack;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray())
            if(Character.isLetter(c))
                stack.push(c);
        for(char c : s.toCharArray()){
            if(Character.isLetter(c))
                sb.append(stack.pop());
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseOnlyLetters rev = new ReverseOnlyLetters();
        System.out.println(rev.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
