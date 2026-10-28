class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        map.put(0,1);
        int curr_sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            curr_sum += nums[i];

            int rem = curr_sum % k;

            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem,0) + 1);
        }
        return count;
        
    }
}