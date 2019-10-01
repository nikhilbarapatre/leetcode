package Trees;

public class FlattenBTreeToLinkedList {
    TreeNode prev = null;
    public void flatten(TreeNode root){
        if(root != null){
            flatten(root.right);
            flatten(root.left);
            root.right = prev;
            root.left = null;
            prev = root;
        }
    }
}
