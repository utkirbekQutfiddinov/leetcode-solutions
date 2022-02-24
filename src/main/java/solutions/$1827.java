package solutions;

public class $1827 {
    public int minOperations(int[] nums) {
        int res=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                res+=1;
                nums[i]++;
            } else if(nums[i-1]>nums[i]){
                res+=nums[i-1]-nums[i]+1;
                nums[i]=nums[i-1]+1;
            }
        }
        return res;
    }
}
