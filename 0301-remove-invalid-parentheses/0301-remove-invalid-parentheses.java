class Solution {

    Set<String> ans = new HashSet<>();
    int max_len = Integer.MIN_VALUE;

    public List<String> removeInvalidParentheses(String s) {

        solve(s, 0, "", 0, 0);

        return new ArrayList<>(ans);
    }

    void solve(String s, int i, String temp, int open, int close) {

        if (i == s.length() && open == close) {

            if (temp.length() > max_len) {
                ans.clear();
                max_len = temp.length();
                ans.add(temp);
            }
            else if (temp.length() == max_len) {
                ans.add(temp);
            }

            return;
        }

        if (i >= s.length()) {
            return;
        }

        if (s.charAt(i) != '(' && s.charAt(i) != ')') {

            solve(s, i + 1, temp + s.charAt(i), open, close);
        }

        if (s.charAt(i) == '(') {

            solve(s, i + 1, temp + s.charAt(i), open + 1, close);       // take

            solve(s, i + 1, temp, open, close);           // no take
        }

        if (s.charAt(i) == ')') {

            if (open > close) {

                solve(s, i + 1, temp + s.charAt(i), open, close + 1);   // take
            }
            
            solve(s, i + 1, temp, open, close);           // no take
        }
    }
}