class Solution {
    //Testing
    public static boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }

        String updated = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
        
        int left =0;
        int right = updated.length()-1;

        while(left<right){
            if(updated.charAt(left)!=updated.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}