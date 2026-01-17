class Solution {
    public static int maxFrequencyElements(int[] nums) {
        if(nums.length==0){return 0;}

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int num : nums){
            if(hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num)+1);
            }else{
                hashMap.put(num,1);
            }
        }

        int maxFreq = 0;
        int result = 0;

        for(int frequency : hashMap.values()){
            if(frequency>maxFreq){
                maxFreq=frequency;
                result=maxFreq;
            }else{
                if(frequency==maxFreq){
                    result=result+frequency;
                }
            }
        } 
        return result;        
    }
        
    public static void main(String[] args){
        int[] nums = {1,2,2,3,1,4};
        int k = maxFrequencyElements(nums);
        System.out.println(k);
    }
}