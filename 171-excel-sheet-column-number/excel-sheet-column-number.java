class Solution {
    public static int titleToNumber(String columnTitle) {
        int result =0;

        for(int i=0; i<columnTitle.length(); i++){
            char c = columnTitle.charAt(i);
            int val = c-'A'+1;
            result = result *26+val;
        }
        return result; 
    }

    public static void main(String[] args){
        String columnTitle = "A";
        System.out.println(titleToNumber(columnTitle));
    }
}