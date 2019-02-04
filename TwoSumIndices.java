/*
Two sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sum = new int[2];
        for (int i=0; i<nums.length; i++) {
           int diff = target - nums[i];
           if (map.containsKey(diff)) {
                sum[0] = map.get(diff);
                sum[1] = i;
                break;
           } 
           map.put(nums[i], i);
        }
        
        return sum;
    }
}
