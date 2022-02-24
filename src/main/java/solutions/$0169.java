package solutions;

import java.util.Arrays;

public class $0169 {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }
