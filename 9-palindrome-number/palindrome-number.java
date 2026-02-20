class Solution {
    //Testing the solution
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reversed=0;
        int original =x;
        while(x>0){
            reversed = reversed * 10 + x % 10;
            x=x/10;
        }
        return original == reversed;
    }

    public static void main(String[] args){
        int x = 121;
        if(isPalindrome(x)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    
    }
}