class Solution {
    public long removeZeros(long n) {
        long res=0l;
        long coeff=1;
        while(n>0){
            long rem=n%10;
            if(rem>0){
                res+=rem*coeff;
                coeff*=10;
            }
            n/=10;
        }
        return res;
    }
}