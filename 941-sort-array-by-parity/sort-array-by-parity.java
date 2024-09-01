class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ind=0, right=nums.length-1, temp;

            for(int i=0; i<nums.length; i++){
                if(nums[i]%2==1){
                    for(int j=right; j>i; j--){
                        if(nums[j]%2==0){
                            ind=j;
                            break;
                        }
                    }
                    
                    if(ind<i){
                        break;
                    }
                    temp=nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    right--;
                }
            }
        
        return nums;
    }
}