class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;

        for (int num : nums) {
            sum = (int)(((long) sum + num) % p);
        }
        
        int target = sum % p;

        if (target == 0) {
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int prefix = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix = (int)(((long) prefix + nums[i]) % p);

            int need = (prefix - target + p) % p;

            if (map.containsKey(need)) {
                minLen = Math.min(minLen, i - map.get(need));
            }

            map.put(prefix, i);
        }

        return minLen == nums.length ? -1 : minLen;
    }
}