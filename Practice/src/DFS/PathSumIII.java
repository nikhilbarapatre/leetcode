package DFS;


public class PathSumIII {
    public  class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int pathSum(TreeNode root, int sum){
        if(root == null)
            return 0;
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int helper(TreeNode node, int sum){
        if(node == null)
            return 0;
        return (node.val == sum ? 1 : 0) +
                helper(node.left, sum - node.val) + helper(node.right, sum - node.val);
    }
}
