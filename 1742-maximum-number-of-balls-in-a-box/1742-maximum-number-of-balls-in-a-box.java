class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        int[] boxes = new int[46];
        int sum;

        for (int i = lowLimit; i <= highLimit; i++){
            sum = getsum(i);
            boxes[sum]++;
        }

        int count = 0;

        for (int j = 1; j < 46; j++){
            count = Math.max(count,boxes[j]);
        }
        return count;
    }
    public int getsum(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }    
}