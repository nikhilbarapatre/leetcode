package Trees;

import java.util.*;

public class N_aryTreePreorder {
    //Iterative
    public List<Integer> preoderItr(Node root){
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            result.add(node.val);
            for(int i = node.children.size() - 1; i >= 0; i--){
                stack.add(node.children.get(i));
            }
        }
        return result;
    }

    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderRec(Node root){
        if(root == null)
            return result;
        result.add(root.val);
        for(Node node : root.children)
            preorderRec(node);
        return result;
    }
}
