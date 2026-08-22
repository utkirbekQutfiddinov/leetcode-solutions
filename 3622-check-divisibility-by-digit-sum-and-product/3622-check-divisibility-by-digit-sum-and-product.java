class Solution {
    public boolean checkDivisibility(int n) {
        int n1=n;
        int digitSum=0, digitProduct=1;

        while(n1!=0){
            int digit=n1%10;
            digitSum+=digit;
            digitProduct*=digit;
            n1/=10;
        }
        return n%(digitSum+digitProduct)==0;
    }
}