class Solution {
    public int tribonacci(int n) {
        
        if(n<2) return n;
        else if(n==2) return 1;
        
        
        int[] t=new int[n+1];
        t[0]=0;
        t[1]=1;
        t[2]=1;
        
        
        
        for(int i=3; i<=n; i++){
            t[i]=t[i-1]+t[i-2]+t[i-3];
        }
        
        return t[n];
            
    }
}