/*
Problem:
Given an integer array, find the contiguous subarray
which has the largest sum and return its sum.

Approach (Kadane Algorithm):
- Keep current sum and maximum sum
- At each element, decide whether to start a new subarray
  or extend the existing one

Time Complexity: O(n)
Space Complexity: O(1)
*/

class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    // For testing
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // Output: 6
    }
}
