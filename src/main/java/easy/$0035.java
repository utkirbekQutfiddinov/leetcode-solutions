package easy;

public class $0035 {
    public int searchInsert(int[] nums, int target) {
        int i =0;
        while(i < nums.length)
        {
            if(nums[i] == target)
            {
                return i;
            }
            else if(nums[i] > target)
            {
                return i;
            }
            i++;
        }
        return nums.length;
    }
}
