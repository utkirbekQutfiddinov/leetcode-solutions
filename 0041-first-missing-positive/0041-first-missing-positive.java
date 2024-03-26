class Solution {
    public int firstMissingPositive(int[] nums) {
        int katta=nums[0];
        Set<Integer> set=new HashSet<>();
        
        for(int i: nums){
            set.add(i);
            if(i>katta){
                katta=i;
            }
        }
        
        for(int i=1; i<katta; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        if(katta>0){
            return katta+1;
        }else {
            return 1;
        }
        
    }
}