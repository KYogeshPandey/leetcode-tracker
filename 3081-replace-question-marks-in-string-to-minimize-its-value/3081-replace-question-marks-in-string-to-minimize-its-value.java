class Solution {
    public String minimizeStringValue(String s) {

        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        ArrayList<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch != '?') {
                freq[ch - 'a']++;
            }
        }

        for (char ch : s.toCharArray()) {
            if (ch == '?') {
                char c = check(freq);
                list.add(c);
                freq[c-'a']++;
            }
        }


        Collections.sort(list);
        int idx = 0;
        for (char ch : s.toCharArray()) {
            if (ch != '?') {
                sb.append(ch);
            }
            else {
                sb.append(list.get(idx));
                idx++;
            }
        }
        return sb.toString();

    }
    static char check(int[] freq) {
        int max_freq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] < freq[max_freq]) {
                max_freq = i;
            }
        }
        return (char) ('a'+ max_freq);
    }
}











