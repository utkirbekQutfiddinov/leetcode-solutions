class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int count=0, prev=-1;
        boolean isIncreasing=false;
        for(int i=0; i<nums.length; i++){
           for(int j=i; j<nums.length; j++){
                isIncreasing=true;
                prev=-1;
                for(int z=0; z<nums.length; z++){
                    if(z>=i && z<=j) continue;
                    if(nums[z]>prev){
                        prev=nums[z];
                    }else {
                        isIncreasing=false;
                        break;
                    }
                }

                if(isIncreasing){
                    count++;
                }
           }
        }
        
return count;
    }
}