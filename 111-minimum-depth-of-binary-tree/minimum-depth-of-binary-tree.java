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
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        return height(root);
    }

        private static int height (TreeNode node){
        if(node ==null){ return 0;}

        if (node.left == null) {
            return height(node.right) + 1;
        }

        if (node.right == null) {
            return height(node.left) + 1;
        }

        return Math.min(height(node.left), height(node.right)) + 1;

    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(minDepth(root));
    }
}