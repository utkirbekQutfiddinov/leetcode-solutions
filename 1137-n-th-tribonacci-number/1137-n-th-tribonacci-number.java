class Solution {
    public int tribonacci(int n) {
       if(n==0) return 0;
        else if(n==1|n==2) return 1;
        int a=0,b=1,c=1;
     while(n>2){
         int sum=a+b+c;
         a=b;
         b=c;
         c=sum;
         n--;
     }
        return c;
    }
}