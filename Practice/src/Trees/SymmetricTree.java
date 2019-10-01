package Trees;

import java.util.*;

/*
* Here we will go by 2 approaches, Recursive and Iterative
*
* --RECURSIVE--
* In this approach, we will be using an isMirror() function where we will traverse the root twice as in, consider it two
* different trees and look for same values in the left and the right as well as the root.
*
* --ITERATIVE--
* In this approach, we will be using a LinkedList and put in the values of the tree and consider it as 2 different trees
* as in the recursive approach.
* */

public class SymmetricTree {
    //RECURSIVE
    public boolean isSymmetricRec(TreeNode root){
        return isMirror(root, root);
    }
    private boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        return (t1.val == t2.val)
                && isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left);
    }

    //ITERATIVE
    public boolean isSymmetricItr(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if(t1 == null && t2 == null)
                continue;
            if(t1 == null || t2 == null)
                return false;
            if(t1.val != t2.val)
                return false;
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }
        return true;
    }
}
