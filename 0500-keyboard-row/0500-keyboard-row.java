class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm"; 

        ArrayList<String> ans = new ArrayList<>();

        for (String word:words) {
            boolean valid = true;
            String str = word.toLowerCase();
            String curr_row = "";
            if (row1.contains(""+str.charAt(0))){
                curr_row = row1;
            } else if (row2.contains("" + str.charAt(0))) {
                curr_row = row2;
            } else {
                curr_row = row3;
            }
            for (int i = 0; i < str.length(); i++) {
                if (!curr_row.contains(""+str.charAt(i))){
                    valid = false;
                    break;
                }
            }
            if (valid) {
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }
}