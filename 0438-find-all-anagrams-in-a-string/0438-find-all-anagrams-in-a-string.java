class Solution {
    boolean isvalid(int[]freq) {
        for (int f : freq) {
            if (f != 0)return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (m > n) return list;

        int[] freq = new int[26];

        for (int i = 0; i < m; i++) {
            freq[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < m-1; i++) {
            freq[s.charAt(i) - 'a']--;
        }

        for (int i = m-1; i < n; i++) {
            freq[s.charAt(i) - 'a']--;

            if (isvalid(freq)) {
                list.add(i-m+1);
            }

            freq[s.charAt(i-m+1) - 'a']++;
        }

        return list;
    }

}