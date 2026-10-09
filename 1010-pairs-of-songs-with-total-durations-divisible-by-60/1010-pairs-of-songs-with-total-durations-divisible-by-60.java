class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        int ans = 0;

        for (int i = 0; i < time.length; i++) {
            int t = time[i];
            int remaining = t % 60;
            int need = (60 - remaining) % 60;

            ans += seen.getOrDefault(need, 0);

            seen.put(remaining, seen.getOrDefault(remaining, 0) + 1);
        }

        return ans;
    }
}