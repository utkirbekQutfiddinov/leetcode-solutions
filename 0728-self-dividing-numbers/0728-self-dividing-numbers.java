class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new ArrayList<>(); 
        for(int i=left; i<=right; i++){
            if(!hasZero(i) && isDivisible(i)){
                result.add(i);
            }
        }
        return result;
    }
    private boolean hasZero(int num){
        while(num>0){
            if(num%10==0) return true;
            num/=10;
        }
        return false;
    }
    private boolean isDivisible(int num){
        int copy=num;
        while(num>0){
            if(copy%(num%10)!=0) return false;
            num/=10;
        }
        return true;
    }
}