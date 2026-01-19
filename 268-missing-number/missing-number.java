class Solution {
    //Testing
    public static int missingNumber(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        int n = nums.length;
        int actual = 0;
        int expected = n*(n+1)/2;

        for(int i=0; i<n; i++){
            actual = actual+ nums[i];
        }

        return expected-actual;

    }
    
    public static void main(String[] args){
        int[] nums = {3,0,1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
}