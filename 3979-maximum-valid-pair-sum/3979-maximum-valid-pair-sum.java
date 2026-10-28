class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int temp1 = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++) {
            temp1 = Math.max(temp1, nums[j-k]);
            ans = Math.max(ans, temp1+nums[j]);
        }
        return ans;
    }
}