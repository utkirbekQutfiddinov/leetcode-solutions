class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freqs=new int[10];
        int res=0;

        while(n>0){
            res=n%10;
            freqs[res]++;
            n/=10;
        }

        for(int i=0; i<freqs.length; i++){
            if(freqs[i]==0){
                continue;
            }

            if(freqs[i]<freqs[res]){
                res=i;
            }else if(freqs[i]==freqs[res] && i<res){
                res=i;
            }
        }

        return res;
    }
}