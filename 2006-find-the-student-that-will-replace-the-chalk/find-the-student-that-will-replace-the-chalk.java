class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
       long sum=0;

        for(int n: chalk){
            sum=sum+n;
            if(sum>k){
                break;
            }
        }
        
        k=k%(int)sum;


        k = k % (int) sum;
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k = k - chalk[i];
        }
        return 0;
    }
}