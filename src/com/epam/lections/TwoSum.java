package com.epam.lections;

import java.util.Arrays;

public class TwoSum {

    public static void main(String args[]) {
        Solution solution = new Solution();
        int target = 10;
        int num[] = {2, 8, 0, 4};
        num = solution.twoSum(num, target);

        System.out.println(Arrays.toString(num));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        int sum;
        for (int i = 0; i + 1 < nums.length; i++) {
            sum = nums[i] + nums[i + 1];

            if (sum == target) {
                result[0] = i;
                result[1] = i + 1;
                return result;
            }
        }
        return null;
    }
}

