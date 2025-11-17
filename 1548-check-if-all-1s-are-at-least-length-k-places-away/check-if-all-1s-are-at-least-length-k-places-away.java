class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int dist=k;

        for(int i: nums){
            if(i==1){
                if(dist<k){
                    return false;
                }
                dist=0;
            }else {
                dist++;
            }
        }

        return true;
    }
}