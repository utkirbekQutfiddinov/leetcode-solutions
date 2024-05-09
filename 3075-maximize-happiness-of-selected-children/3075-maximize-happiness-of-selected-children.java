class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int temp;
        for (int i = 0; i < happiness.length / 2; i++) {
            temp = happiness[i];
            happiness[i] = happiness[happiness.length - 1 - i];
            happiness[happiness.length - 1 - i] = temp;
        }
        
        long sum=0;
        
        for(int i=0; i<k; i++){
            if((happiness[i]-i)>0){
               sum+=happiness[i]-i; 
            }
        }
        
        return sum;
    }
}