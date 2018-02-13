package com.zhaoran.git;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 是否是回文数字
     * @param digitInt
     * @return
     */
    public boolean isPalindrome(int digitInt){
        long reverse = 0;
        int temp = digitInt;
        if (digitInt < 0) {
            return false;
        }
        while (temp != 0) {
            reverse = reverse * 10 +  temp%10;
            temp /= 10;
        }
     
        return digitInt == reverse;
    }
    /**
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("no two sum solution");
    }
    public int countBinarySubstrings(String s) {
        int ans = 0, prev = 0, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                ans += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            } else {
                cur++;
            }
        }
        return ans + Math.min(prev, cur);
    }
}
