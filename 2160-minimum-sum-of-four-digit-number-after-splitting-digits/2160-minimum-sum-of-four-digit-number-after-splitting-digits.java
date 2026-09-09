class Solution {
    public int minimumSum(int num) {

        int[] digits = new int[4];

        for(int i = 0; i < 4; i++){
            int digit = num % 10;
            num = num / 10;
            digits[i] = digit; 
        }
        Arrays.sort(digits);

        int num1 = digits[0] * 10 + digits[3];
        int num2 = digits[1] * 10 + digits[2];

        return num1 + num2;
        
    }
}