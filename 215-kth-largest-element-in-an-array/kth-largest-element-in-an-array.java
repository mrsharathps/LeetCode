class Solution {
    //Testing
    public static int findKthLargest(int[] nums, int k) {
        if(nums.length==0){ 
            return 0;}

            PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

            for (int num : nums) {
                minHeap.add(num);

                if(minHeap.size()>k){
                    minHeap.poll();
                }

            }
            return minHeap.peek();
    }

    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k =2;
        System.out.println(findKthLargest(nums, k));
    }
}
