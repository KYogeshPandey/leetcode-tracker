class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int temp1 = 0;
        int ans = 0;

        for (int j = k; j < nums.length; j++) {
            temp1 = Math.max(temp1, nums[j-k]);
            ans = Math.max(ans, temp1+nums[j]);
        }
        return ans;
    }
}