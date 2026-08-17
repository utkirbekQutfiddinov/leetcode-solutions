class Solution {
    public int alternatingSum(int[] nums) {
      int sum=0;
      boolean add=true;
      for(int num: nums){
        if(add){
            sum+=num;
        }else {
            sum-=num;
        }

        add=!add;
      }  
      return sum;
    }
}