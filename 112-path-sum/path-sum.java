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
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){ return false;}

        if(root.left ==null && root.right== null){
            return targetSum==root.val;
        }

        int remainingVal = targetSum - root.val;

        return hasPathSum(root.left,remainingVal) || hasPathSum(root.right,remainingVal);
        
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int targetSum = 5;
        System.out.println(hasPathSum(root, targetSum));
    }
}