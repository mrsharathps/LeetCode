class Solution {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int result = nums[0];

        int maxResult = nums[0];

        for(int i=1; i<nums.length; i++){
            maxResult = Math.max(maxResult+nums[i], nums[i]);
            result = Math.max(result,maxResult);
        }
        
        return result;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}