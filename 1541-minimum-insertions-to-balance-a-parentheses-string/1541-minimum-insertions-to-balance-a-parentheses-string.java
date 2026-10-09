import java.util.Stack;

class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                // Do consecutive ')' mil gaye toh pair complete
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    // Ek ')' insert karna padega
                    ans++;
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // Matching '(' nahi hai
                    ans++;
                }
            }
        }

        // Har unmatched '(' ke liye do ')' chahiye
        ans += stack.size() * 2;

        return ans;
    }
}