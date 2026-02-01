// class Solution {
//     public static int majorityElement(int[] nums) {
//         if(nums.length == 0){ return 0;}

//         Arrays.sort(nums);
//         return nums[nums.length / 2];
//     }

//     public static void main(String[] args){
//         int[] nums = {2,2,1,1,1,2,2};
//         System.out.println(majorityElement(nums));
//     }
// }
 
class Solution {
    //Testing
    public static int majorityElement(int[] nums) {
        int occurance = 0;
        int result = 0;

        for(int num : nums){
            if(occurance==0){
                result=num;
            }

            if(num==result){
                occurance++;
            }
            else{
                occurance--;}
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}