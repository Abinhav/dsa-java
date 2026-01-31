/*
Problem:
Given an array of integers and a target, return indices of two numbers
such that they add up to target.

Approach:
- Use HashMap to store value and index
- Check complement while iterating

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
