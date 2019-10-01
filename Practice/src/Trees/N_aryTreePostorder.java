package Trees;
import java.util.*;


public class N_aryTreePostorder {
    //Recursive
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderRec(Node root){
        if(root == null)
            return result;
        for(Node node : root.children)
            postorderRec(node);
        result.add(root.val);
        return result;
    }

    //Iterative
    public List<Integer> postorderItr(Node root){
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            result.add(node.val);
            for(Node n : node.children)
                stack.push(n);
        }
        Collections.reverse(result);
        return result;
    }
}
