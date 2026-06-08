class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //hour is between 1 and max pile
        int left=1, right=0, res=0;

        for(int pile: piles){
            if(pile>right) right=pile;
        }

        while(left<=right){
            int mid=left+(right-left)/2;
            long hours=0;
            for(int i=0; i<piles.length; i++){
                hours+=(piles[i]+mid-1)/mid;
            }
            if(hours<=h){
                res=mid;
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return res;
    }
}