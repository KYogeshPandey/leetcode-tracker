class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int start=0;
        int last=words.length-1;

        while(start <= last) {
            rev(words, start, last);
            start++;
            last--;
        }

        StringBuilder sb = new StringBuilder();

        for(String St : words) {
            sb.append(St);
            sb.append(" ");
        }

        return sb.toString().trim();

        
    }
    static void rev(String[] words, int f, int l) {
        String temp = words[f];
        words[f] = words[l];
        words[l] = temp;
    }
}