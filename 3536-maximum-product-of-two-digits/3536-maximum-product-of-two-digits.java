class Solution {
    public int maxProduct(int n) {
        int maxDigit=0, secondMax=0;

        while(n>0){
            int digit=n%10;
            if(digit>=maxDigit){
                secondMax=maxDigit;
                maxDigit=digit;
            }else if (digit >= secondMax){
                secondMax = digit;
            }
            n/=10;
        }

        return maxDigit*secondMax;
    }
}