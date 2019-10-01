package Trees;

public class DiameterOfBTree {
    int diameter = 1;
    public int diameterOfBTree(TreeNode root){
        dfs(root);
        return diameter - 1;
    }
    private int dfs(TreeNode root){
        if(root == null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        diameter = Math.max(diameter, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
