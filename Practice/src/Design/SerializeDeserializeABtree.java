package Design;

import java.util.*;

public class SerializeDeserializeABtree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return serializeHelper(root, "");
        }

        private String serializeHelper(TreeNode root, String result){
            if(root == null)
                result += "null,";
            else{
                result += String.valueOf(root.val) + ",";
                result = serializeHelper(root.left, result);
                result = serializeHelper(root.right, result);
            }
            return result;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] dataArray = data.split(",");
            List<String> dataList = new ArrayList<>(Arrays.asList(dataArray));
            return deserializeHelper(dataList);
        }

        private TreeNode deserializeHelper(List<String> list){
            if(list.get(0).equals("null")){
                list.remove(0);
                return null;
            }
            TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
            list.remove(0);
            root.left = deserializeHelper(list);
            root.right = deserializeHelper(list);
            return root;
        }
    }
}
