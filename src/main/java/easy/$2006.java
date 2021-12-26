package easy;

public class $2006 {
    public int countKDifference(int[] nums, int k) {
        int res=0;
        int[] count=new int[101];
        for(short i=0; i<nums.length; i++)
            count[nums[i]]++;
        for(int j=k; j<101; j++){
            res+=count[j]*count[j-k];
        }
        return res;
    }
}
