/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int index = peakIndexInMountainArray(mountainArr);
        return ogbs(mountainArr,target,index);
    }
    static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start <  end) {
            int mid = start + (end - start)/2;
            if (mountainArr.get(mid) > mountainArr.get(mid+1)) {
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
    static int ogbs(MountainArray mountainArr, int target, int index) {
        int start = 0;
        int end = index;

        // check for ascending order till peak_index
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (mountainArr.get(mid) < target) {
                start = mid + 1;
            } else if (mountainArr.get(mid) > target) {
                end = mid - 1;
            } else if (mountainArr.get(mid) == target) {
                return mid;
            }
        }
        // first part mein target nhi mila
        if (start > end) {
            start = index + 1;
            end = mountainArr.length() - 1;

            // binary search in descending part
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mountainArr.get(mid) > target) {
                    start = mid + 1;
                } else if (mountainArr.get(mid) < target) {
                    end = mid - 1;
                } else if (mountainArr.get(mid) == target) {
                    return mid;
                }
            }
        }
        return -1;
    }
}