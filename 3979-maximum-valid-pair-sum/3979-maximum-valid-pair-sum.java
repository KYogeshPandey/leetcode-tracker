class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int temp1 = 0;
        int ans = 0;

        for (int j = 0; j < nums.length-k; j++) {
            temp1 = Math.max(temp1, nums[j]);
            ans = Math.max(ans, temp1+nums[j+k]);
        }
        return ans;
    }
}