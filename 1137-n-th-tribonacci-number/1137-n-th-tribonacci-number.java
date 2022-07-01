class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        else if(n==1|n==2) return 1;
        int[] t=new int[n];
        t[0]=0;
        t[1]=1;
        t[2]=1;
        for(int i=3; i<n; i++)
            t[i]=t[i-1]+t[i-2]+t[i-3];
        
        return t[n-1]+t[n-2]+t[n-3];
    }
}