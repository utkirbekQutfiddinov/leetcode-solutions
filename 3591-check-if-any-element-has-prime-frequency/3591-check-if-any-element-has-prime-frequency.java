class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freqs=new int[101];
        for(int num: nums){
            freqs[num]++;
        }

        for(int num: freqs){
            if(num>0){
                if(isPrime(num)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}