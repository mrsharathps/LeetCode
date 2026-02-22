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
    //Testing the solution....
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println(isSameTree(p, q));

    }
}