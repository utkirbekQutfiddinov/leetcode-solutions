class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ps=new int[nums.length/2];
        int[] ns=new int[nums.length/2];
        int[] res=new int[nums.length];
        
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                ps[index++]=nums[i];
            }
        }
        
        index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                ns[index++]=nums[i];
            }
        }
        
        for(int i=0; i<ps.length; i++){
            res[2*i]=ps[i];
            res[2*i+1]=ns[i];
        }
        
        return res;
    }
}