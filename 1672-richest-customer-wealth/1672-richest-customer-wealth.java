class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] row : accounts){
            int rowsum = 0;
            for (int col : row){
                rowsum += col;
            }
            if (rowsum > max){
                max = rowsum;
            }
        }
        return max;
        
    }
}