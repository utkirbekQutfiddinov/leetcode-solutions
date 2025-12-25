class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        long result=0;

        for(int i=happiness.length-1, j=0; i>=0 && j<k; i--, j++){
            result+=Math.max(happiness[i]-j,0);
        }

        return result;
    }
}