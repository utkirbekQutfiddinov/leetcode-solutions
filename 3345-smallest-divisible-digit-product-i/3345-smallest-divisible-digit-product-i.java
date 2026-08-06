class Solution {
    public int smallestNumber(int n, int t) {
        while(getProduct(n)%t!=0){
            n++;
        }
        return n;
    }

    private int getProduct(int num){
        int result=1;
        while(num>0){
            result*=num%10;
            num/=10;
        }
        return result;
    }
}