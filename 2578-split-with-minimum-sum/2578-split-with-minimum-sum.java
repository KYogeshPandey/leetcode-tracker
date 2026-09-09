class Solution {
    public int splitNum(int num) {
        
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        int n = digits.length;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int size = 0;
        for(int i = 0; i < n; i = i + 2){
            s1.append(digits[i]);

            if( i + 1 < n){
                s2.append(digits[i + 1]);
            }
        }
        int result = Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString());
        return result;
    }
}