/**
66. Plus One
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
**/
class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int c = 1;
        while(i>=0 && (digits[i]+c) == 10){
            digits[i]=0;
            i--;
        }
        if (i>=0) {
            digits[i]+=c;
        } else {
            if (c==1) {
                int[] temp = new int[digits.length+1];
                temp[0]=1;
                for(int j=temp.length-2; j>0; j--){
                    temp[j] = digits[j-1];
                }
                digits=temp;
            }
        }
        
        return digits;
    }
}
