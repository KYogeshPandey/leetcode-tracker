class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> list = new ArrayList<>();

        int smaller = 0;
        int count = 0;

        for (int num : nums){
            if (num < target){
                smaller++;
            }
            if (num == target){
                count++;
            }
        }
        for(int i = 0; i <= count - 1; i++){
            list.add(smaller + i);
        }

        return list;
        
        

    }
}