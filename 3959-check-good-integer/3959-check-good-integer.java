class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0, squareSum=0;

        while(n>0){
            int rem=n%10;
            digitSum+=rem;
            squareSum+=rem*rem;
            n/=10;
        }

        return squareSum-digitSum>=50;
    }
}