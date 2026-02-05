class Solution {
    //Solution testing
    public static boolean isHappy(int n) {

        int slow =n;
        int fast =n;

        while(true){
            slow = nextNum(slow);
            fast = nextNum(nextNum(fast));

            if(slow == fast){
                break;
            }
        }

    return slow ==1;
    }


    private static int nextNum(int n){
        int result = 0;

        while (n>0){
            int num = n%10;
            result = result + num * num;
            n= n/10;
        }
        return result;  
    }


    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }
}
