class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum0=(rolls.length+n)*mean;
        int sum1=0;

        for(int i: rolls){
            sum1+=i;
        }

        int sum2=sum0-sum1;

        if(sum2>6*n || sum2<n){
            return new int[0];
        }

        int[] res=new int[n];

        int son=sum2/n;

        for(int i=0; i<n; i++){
            res[i]=son;
            sum2-=son;
        }

        int ind=0;

        while(sum2>0){
            res[ind]++;
            sum2--;
            ind=(ind+1)%n;
        }
        return res;
    }
}