class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] leftProd=new int[n], rightProd=new int[n];
        int prod=1;
        for(int i=0; i<n; i++){
            leftProd[i]=prod;
            prod*=nums[i];
        }

        prod=1;
        for(int i=n-1; i>=0; i--){
            rightProd[i]=prod;
            prod*=nums[i];
        }

        for(int i=0; i<n; i++){
            nums[i]=leftProd[i]*rightProd[i];
        }
        return nums;
    }
}