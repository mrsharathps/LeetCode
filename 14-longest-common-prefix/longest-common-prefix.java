class Solution {
    //Testing the solution....
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
        return "";
    }

    int minLen = Integer.MAX_VALUE;

    for (String s : strs) {
    minLen = Math.min(minLen, s.length());}

    StringBuilder prefix = new StringBuilder();
    
    for (int i = 0; i < minLen; i++) {
    char currentChar = strs[0].charAt(i);
    for (int j = 1; j < strs.length; j++) {
        if(strs[j].charAt(i)!=currentChar){
            return prefix.toString();
        }
    }

    prefix.append(currentChar);
}
return prefix.toString();   
    }

    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
}