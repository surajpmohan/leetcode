/**
34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
**/

class Solution {
    static int ind[] = new int[2];
    public int[] searchRange(int[] nums, int target) {
        ind[0] = -1;
        ind[1] = -1;
        binSearch(nums, target, 0, nums.length-1);
        return ind;
    }
    
    public static void binSearch(int[] nums, int t, int s, int e) {
        if (s>e) {
            return;
        }
        int mid = s + (e-s)/2;
        if (nums[mid]<t){
            binSearch(nums, t, mid+1, e);
        } else if (nums[mid]>t) {
            binSearch(nums, t, s, mid-1);
        } else {
            if (ind[0]==-1){
                ind[0] = mid;
                ind[1] = mid;
                binSearch(nums, t, s, mid-1);
                binSearch(nums, t, mid+1, e);
            } else {
                if (mid<ind[0]) {
                    ind[0] = mid;
                    binSearch(nums, t, s, mid-1);
                } 
                if (mid>ind[1]) {
                    ind[1]=mid;
                    binSearch(nums, t, mid+1, e);
                }            

            }
        }
    }
}
