class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber % 26;
            sb.append((char) ('A' + rem));
            columnNumber= columnNumber/26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        int columnNumber=1;
        System.out.println(convertToTitle(columnNumber));
    }
}