//Testing
class Solution {
    public static int romanToInt(String s) {
        int result = 0;

        for(int i=0; i<s.length(); i++){
            int curr = value(s.charAt(i));
            if(i+1<s.length() && curr< value(s.charAt(i+1))){
               result = result-curr; 
            } else{
                result = result+curr;
            }

        }
        return result;
    }
        
        private static int value(char c){
            String romanName;
            switch(c){
                case 'I':
                    romanName = "1";
                    break;
                case 'V':
                    romanName = "5";
                    break;
                case 'X':
                    romanName = "10";
                    break;
                case 'L':
                    romanName = "50";
                    break;
                case 'C':
                    romanName = "100";
                    break;
                case 'D':
                    romanName = "500";
                    break;
                case 'M':
                    romanName = "1000";
                    break;
                default:
                    romanName = "Invalid Roman Numeral";
                    break;
            }
            return Integer.parseInt(romanName);
    }

    public static void main(String[] args){
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println(result);
    }
}