class Solution {
    public int[] sortByReflection(int[] nums) {
    
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                String binni=Integer.toBinaryString(nums[i]);
                String binnj=Integer.toBinaryString(nums[j]);
                long bini=Long.parseLong(new StringBuilder(binni).reverse().toString(),2);
                long binj=Long.parseLong(new StringBuilder(binnj).reverse().toString(),2);
                if(binj<bini){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }else if(bini==binj && nums[j]<nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;

    }
}