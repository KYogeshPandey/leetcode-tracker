class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if (sum== 0 || sum > 9*num) {
            return "";
        }
        if (num == 1) {
            if(sum <= 9) {
                return String.valueOf(sum);
            }
           return "";
        }
        if ( sum < 9) {
            sb.append(sum);
            for (int i = 0; i < num-1; i++) {
                sb.append(0);
            }
            return sb.toString();
        }
        while(sb.length()<num){
            if (sum >= 9) {
                sb.append(9);
                sum -= 9;
            }
            else {
                sb.append(sum);
                sum=0;
            }
        }
        return sb.toString();
        
    }
}