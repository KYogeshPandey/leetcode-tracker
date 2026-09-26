class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    boolean even (int num){
        int numofdigits = digits(num);
        return numofdigits % 2 == 0;
    }

    int digits (int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int digit = 0;
        while(num != 0){
            digit++;
            num /= 10;
        }
        return digit;
    }
    
}