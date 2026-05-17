class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int prod = 1, left = 0, res = 0;

        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            // every subarray ending at right and starting from left to right is valid
            res += right - left + 1;
        }

        return res;
    }
}