package solutions;

public class $0747 {
    public int dominantIndex(int[] nums) {
        int maxIndex=0;
        for(int i=1; i<nums.length; i++)
            if(nums[i]>nums[maxIndex]) maxIndex=i;
        for(int i=0; i<nums.length; i++)
            if(i!=maxIndex&&((2*nums[i])>nums[maxIndex])) return -1;
        return maxIndex;
    }
}
