class Solution {
    public static String removeKdigits(String num, int k) {
    
        int n = num.length();

        //digits to remove is same as string lenth
        if(k==n){
            return "0";
        }

        //stack declaration
        Stack<Character> stack = new Stack<>();
        
        //getting individual characters of num which is converted to charArray
        for( char c : num.toCharArray()){

            //last digit in stack is bigger that current character gotten from c. If so pop it
            while(!stack.isEmpty() && k > 0 && stack.peek()>c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k>0){
            stack.pop();
            k--;
        }

        //return value expects a string. hence converting stack to string
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }

        int i =0;
        //removing the leading zero
        while(i<sb.length()-1 && sb.charAt(i) == '0'){
            i++;
        }

        return sb.substring(i);
        
    }

    public static void main(String[] args){
        String nums = "1432219";
        int k=0;
        System.out.println(removeKdigits(nums, k));
    }
}