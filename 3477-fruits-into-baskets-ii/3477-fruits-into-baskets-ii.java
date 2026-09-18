class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        boolean found=false;
        for(int i=0; i<fruits.length; i++){
            found=false;
            for(int j=0; j<baskets.length; j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=0;
                    found=true;
                    break;
                }
            }
            if(!found) count++;
        }
        return count;
    }
}