class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivotwithDuplicates(nums);

        // pivot not found, means array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length-1) != -1;
        } 

        // if pivot is found , you have two ascending sorted arrays
        if (nums[pivot] == target) {
            return true;
        }

        if (nums[0] > target) {
        return binarySearch(nums, target, pivot + 1, nums.length - 1) != -1;
        }
        return binarySearch(nums, target, 0, pivot - 1) != -1;
    }
    int binarySearch(int[] arr, int target, int start, int end) {
        
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    int findPivotwithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            // case 1 : mid is grater than mid+1
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            // case 2 : mid is less than mid-1
            if (start < mid && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            // when start = mid = end 
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // check whether start or end are pivot or not?
                // agr start element > start + 1 element then pivot will be start
                if (start < end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                // check for end pivot ?
                if (start < end && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // case 3 :  pivot should be on left
            else if (arr[mid] < arr[end] || (arr[mid] == arr[end] && arr[start] > arr[mid])) {
                end = mid - 1;
            } 
            // case 4 : start < mid, then pivot should be on right
            else {
                start = mid + 1;
            } 
        }
        return -1;
    }
}