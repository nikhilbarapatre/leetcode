package Trees;

public class SumRootToLeafNumbers {
    int result;
    public int sumRootToLeafNum(TreeNode root){
        result = 0;
        preorder(root, 0);
        return result;
    }
    private void preorder(TreeNode root, int sum){
        if(root != null){
            sum = sum * 10 + root.val;
            if(root.left == null && root.right == null){
                result += sum;
                return;
            }
            preorder(root.left, sum);
            preorder(root.right, sum);
        }
    }
}
