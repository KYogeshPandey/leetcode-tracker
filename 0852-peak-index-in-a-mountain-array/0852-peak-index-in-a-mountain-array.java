class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <  end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                // you are at decreasing part of array
                // this may be ans, but look at left
                end = mid;
            } else {
                // mid + 1 element is greater than mid
                start = mid + 1;
            }
        }
        // in the end start == end and pointing to the largest number because of the two checks
        // start and end are always trying to find  max element in the above two checks
        // hence when they point to a element that is the max element
        return start;
    }
}