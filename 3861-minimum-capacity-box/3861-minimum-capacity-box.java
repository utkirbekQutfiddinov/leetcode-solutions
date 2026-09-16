class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int res=0;
        boolean found=false;
        for(int i=0; i<capacity.length; i++){
            if(capacity[i]>=itemSize){
                if(!found){
                    res=i;
                    found=true;
                }else if(capacity[i]<capacity[res]){
                    res=i;
                }
            }
        }
        if(found)
        return res;
        else return -1;
    }
}