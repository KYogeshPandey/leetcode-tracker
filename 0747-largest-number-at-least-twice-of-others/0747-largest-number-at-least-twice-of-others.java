class Solution {
    public int dominantIndex(int[] nums) {

        int Index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[Index]){
                Index = i;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i != Index && nums[Index] < 2 * nums[i]){
                return -1;
            }
        }
        return Index;
        
    }
}