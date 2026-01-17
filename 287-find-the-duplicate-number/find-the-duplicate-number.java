// Note: Generic array approach failed while evaluating extremy big array with Time Limit Exceeded error. Since time complexity becomes O(n square).  57 / 59 testcases passed and lengthy arrays started to fail as the execution cannot be completed within 1min. 

// class Solution { 
//     public static int findDuplicate(int[] nums) {
//         if(nums.length==0){return 0;}

//         for(int i=0; i<nums.length ; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     return nums[i];
//                 }
//             }
//         }
//         return 0;
        
//     }

//     public static void main(String[] args){
//         int[] nums = {1,3,4,2,2};
//         System.out.println(findDuplicate(nums));
//     }
// }

//Trying Floyd cycle algorithm approach

class Solution {
     public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        slow = nums[slow];
        //uses two steps here. ex: nums[2]
        fast = nums[nums[fast]];

        while(slow!=fast){
            slow=nums[slow];
            fast = nums[nums[fast]];
        }

        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }

        return slow;

     }

     public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    } 
}