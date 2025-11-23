class Solution {
    public long sumAndMultiply(int n) {
        long x=0;

        int multiplier=10;
        long sum=0;
        int rem=0;

        while(n>0){
            rem=n%10;
            if(rem==0){
                n/=10;
                continue;
            }
            
            sum+=rem;
            if(x==0){
                x=rem;
            }else {
                x=multiplier*rem+x;
                multiplier*=10;
            }
            n/=10;
        }

        return x*sum;
        
    }
}