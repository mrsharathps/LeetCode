class Solution {
    //Testing
    public static int climbStairs(int n) {
        if(n==0){return 1;}

        int n1=0, n2=1;

        for(int i = 0; i<n; i++){
            

            int n3= n2+n1;
            n1=n2;
            n2=n3;
        } 
        return n2;
    }

    public static void main(String[] args){
        int n = 3;
        int result = climbStairs(n);
        System.out.println(result + " ");

    }
}