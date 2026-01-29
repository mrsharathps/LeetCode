/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
        
    }

    private static void preOrder(TreeNode node, List<Integer> result){
        if(node==null){return;}

        result.add(node.val);
        preOrder(node.left, result);
        preOrder(node.right, result);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        //root.left = new TreeNode(null);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal(root));
    }
}