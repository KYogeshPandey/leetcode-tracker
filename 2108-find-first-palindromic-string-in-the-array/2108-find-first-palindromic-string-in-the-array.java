class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++){

            int low = 0;
            int high = words[i].length() - 1;

            boolean isPalindrome = true;

            while(low < high){
                if (words[i].charAt(low) != words[i].charAt(high)){
                    isPalindrome = false;
                    break;
                }

                low++;
                high--;
            }

            if (isPalindrome){
                return words[i];
            }

        }
        return "";

        
    }
}