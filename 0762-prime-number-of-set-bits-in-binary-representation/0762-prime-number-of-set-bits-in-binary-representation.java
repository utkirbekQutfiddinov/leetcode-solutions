class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left; i<=right; i++){
            String str=Integer.toBinaryString(i);
            if(isPrime(getCount(str))){
                System.out.println(i+", "+str+", is Prime");
                res++;
            }
        }

        return res;   
    }

    private int getCount(String str){
        int count=0;
        for(char c: str.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }

    private boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}