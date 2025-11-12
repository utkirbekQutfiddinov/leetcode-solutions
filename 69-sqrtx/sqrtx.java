class Solution {
    public int mySqrt(int x) {
        long res=0;

        while(res*res<=x){
            res++;
        }
        return (int)(res-1);
    }
}