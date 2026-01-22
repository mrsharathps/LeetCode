class Solution {
    //Testing
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j >=0){
            if(nums1[i]>=nums2[j]){
            nums1[k]=nums1[i];
            i--;
        }else{
            nums1[k]=nums2[j];
            j--;
            
        }
        k--;
    }

    while(j>=0){
        nums1[k]=nums2[j];
        j--;
        k--;
    }    
    return nums1;    
    }
    public static void main(String[] args){
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m=3, n=3;
        int[] result = merge(num1, m, num2, n);
        System.out.println(Arrays.toString(result));
    }
}