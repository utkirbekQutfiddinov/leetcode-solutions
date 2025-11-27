class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long result=0, con;

        int l=0,r=nums.length-1;

        while(l<r){
            con=nums[r]+(long)(Math.pow(10,(int)Math.log10(nums[r])+1)*nums[l]);
            result+=con;
            l++;
            r--;
        }

        if(l==r){
            result+=nums[l];
        }

        return result;
    }
}