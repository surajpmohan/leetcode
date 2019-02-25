/**
151. Reverse Words in a String
Input: "the sky is blue",
Output: "blue is sky the".
**/
public class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder br = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length()>0) {
                br.insert(0, " ");
                br.insert(0, arr[i]);
            }
        }
        return br.toString().trim();
    }
}
