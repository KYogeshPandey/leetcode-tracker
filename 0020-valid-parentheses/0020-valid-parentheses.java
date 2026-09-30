class Solution {
    public boolean isValid(String s) {

        Stack<Character> S = new Stack<>();
        
        for(char c : s.toCharArray()){
            if (c == '(' || c == '{' || c =='['){
                S.push(c);
            }
            else{
                if (S.isEmpty()) return false;
                char p = S.pop();
                if( (p == '(' && c != ')') || (p == '{' && c != '}') || (p == '[' && c!= ']')){
                    return false;
                }    
            }
        }
        return S.isEmpty();
    }
      
}