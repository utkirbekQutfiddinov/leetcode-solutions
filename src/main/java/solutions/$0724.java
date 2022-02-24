package solutions;

public class $0724 {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++)
            sum+=nums[i];
        int left=0;
        for(int i=0; i<nums.length; i++){
            left+=nums[i];
            if((left-nums[i])*2==(sum-nums[i]))
                return i;
        }
        return -1;
    }
}
