class Solution {
    public boolean isUgly(int n) {
        while(n>1&&n%5==0)
            n/=5;
        while(n>1&&n%3==0)
            n/=3;
        while(n>1&&n%2==0)
            n/=2;
        return n==1;
    }
}