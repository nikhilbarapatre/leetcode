package DFS;

import java.util.*;

public class BinaryTreePaths {
    public List<String> bTreePaths(TreeNode root){
        List<String> result = new ArrayList<>();
        if(root != null)
            dfs(root, "", result);
        return result;
    }
    private void dfs(TreeNode root, String path, List<String> result){
        if(root.left == null && root.right == null)
            result.add(path + root.val);
        if(root.left != null)
            dfs(root.left, path + root.val + "->", result);
        if(root.right != null)
            dfs(root.right, path + root.val + "->", result);
    }
}
