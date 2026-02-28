//Testing the solution....
class Solution {

    public static boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {

            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } 
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (character == ')' && top != '(') return false;
                if (character == '}' && top != '{') return false;
                if (character == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s)); // true
    }
}