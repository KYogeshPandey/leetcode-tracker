class Solution {
    public int minInsertions(String s) {
        
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        int i = s.length()-1;

        while(i >= 0) {
            char c = s.charAt(i);
            if (c == ')') {
                if (i-1 >= 0 && c == s.charAt(i-1)) {
                    stack.push(c);
                    stack.push(c);
                    i -= 2;
                }
                else {
                    ans += 1;
                    stack.push(c);
                    stack.push(c);
                    i -= 1;
                }
            }
            else {
                if (stack.size() >= 2) {
                    stack.pop();
                    stack.pop();
                    i -= 1;
                }
                else {
                    ans += 2 - stack.size();
                    i -= 1;
                }
            }  
        }
        ans += stack.size()/2;
        return ans;
    }
}