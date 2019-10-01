package Trees;

/*
* We have given a value and if that value exists in BST, we have to return the subtree rooted at that value
* else return null.
* We will have two approaches
*   - Recursion
*   - Iteration
* Since, it is a BST, we will only need to check the value is less than or greater than root and traverse accordingly.
* */

public class SearchInBST {
    //Recursive
    public TreeNode searchBSTRec(TreeNode root, int val){
        if(root == null)
            return null;
        if(root.val == val)
            return root;
        if(val < root.val)
            return searchBSTRec(root.left, val);
        else
            return searchBSTRec(root.right, val);
    }

    //Iterative
    public TreeNode searchBSTItr(TreeNode root, int val){
        while(root != null && root.val != val){
            if(val < root.val)
                root = root.left;
            else
                root = root.right;
        }
        return root;
    }
}
