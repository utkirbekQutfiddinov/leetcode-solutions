class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n1=x,n2=0;
        while(n1>0){
            n2=n2*10+n1%10;
            n1/=10;
        }
        return n2==x; 
    }
}