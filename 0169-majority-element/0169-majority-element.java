class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int value = 0;

        for (int num : nums){
            if(count == 0){
                value = num;
            }
            if(num == value){
                count++;
            }
            else {
                count--;
            }
        }
        return value;
        
    }
}