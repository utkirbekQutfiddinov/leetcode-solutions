class Solution {
    public int[] resultArray(int[] nums) {
        int[] idx=new int[nums.length];
        idx[0]=1;
        idx[1]=2;
        int i1=0,i2=1;

        for(int i=2; i<nums.length; i++){
            if(nums[i1]>nums[i2]){
                idx[i]=1;
                i1=i;
            }else{
                idx[i]=2;
                i2=i;
            }
        }
        int[] result=new int[nums.length];
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(idx[i]==1){
                result[index++]=nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(idx[i]==2){
                result[index++]=nums[i];
            }
        }
        return result;
    }
}