package String;

import java.util.Stack;

public class ValidParanthesis {
    public boolean validParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        if(s == null || s.length() == 0)
            return true;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '(')
                stack.push(c);
            else if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
            else if(c == '}'){
                if(stack.isEmpty() || stack.pop() != '{')
                    return false;
            }
            else if(c == ']'){
                if(stack.isEmpty() || stack.pop() != '[')
                    return false;
            }
        }
        if(stack.size() == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ValidParanthesis valid =  new ValidParanthesis();
        System.out.println(valid.validParanthesis("()"));
    }
}
