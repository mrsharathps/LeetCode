class Solution {
    public static String removeKdigits(String num, int k) {
    
        int n = num.length();
        if(k==n){
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        
        for( char c : num.toCharArray()){
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

        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }

        int i =0;
        while(i<sb.length()-1 && sb.charAt(i) == '0'){
            i++;
        }

        return sb.substring(i);
        
    }

    public static void main(String[] args){
        String nums = "1432219";
        int k=3;
        System.out.println(removeKdigits(nums, k));
    }
}