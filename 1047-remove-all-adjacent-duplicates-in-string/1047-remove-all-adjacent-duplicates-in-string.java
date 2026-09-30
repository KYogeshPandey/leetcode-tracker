class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()){
            // before adding element in stack
            if (!st.isEmpty() && st.peek() == c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        return res.toString();
        
    }
}