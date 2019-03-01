class Solution {
    public void sortColors(int[] nums) {
        int j = 0;
        int k = nums.length - 1;
        for (int i=0; i<=k; ) {
            if (nums[i] == 0) {
                swap(nums, i, j);
                j++;
                i++;
            } else if (nums[i]==2) {
                swap(nums, i, k);
                k--;
            } else {
                i++;   
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
