class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n1=-1, n2=-1;
        int res=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                n1=i;
            }
            if(nums[i]==2){
                n2=i;
            }
            if(n1>=0 && n2>=0){
                res=Math.min(res,Math.abs(n1-n2));
            }
        }

      if(n1<0 || n2<0){
        return -1;
      }

        return res;
    }
}