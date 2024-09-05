class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum0=0;

        for(int i: rolls){
            sum0+=i;
        }

        int sum=rolls.length*mean+n*mean;
       int sum1=sum-sum0;

        System.out.println("mavjud sum: "+sum0);
        System.out.println("umumiy sum: "+sum);
        System.out.println("keraklli sum: "+sum1);
       if(sum1<0 || n>sum1 || sum1>n*6){
        return new int[0];
       }

       int[] res=new int[n];

        res[0]=sum1/n;
        sum1-=res[0];
       for(int i=1; i<n; i++){
        res[i]=res[i-1];
        sum1-=res[0];
       }
       System.out.println("massiv :"+Arrays.toString(res));
       System.out.println("qoldi : "+sum1);
        int ind=0;
        while(sum1>0){
            res[ind]++;
            ind=(ind+1)%n;
            sum1--;
        }

        return res;
    }
}