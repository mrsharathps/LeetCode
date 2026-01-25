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
    public static TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0){ return null;}

        return bstBuilding(nums, 0, nums.length-1);
    
    }
        private static TreeNode bstBuilding( int[] nums, int left, int right){

            if(left>right){return null;} 
        

            int mid = left + (right-left)/2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left = bstBuilding(nums, left, mid -1);
            root.right = bstBuilding(nums, mid +1, right);

            return root;
        
        }
        

    public static void main(String[] args){
        int[] nums = {-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));

    }
}