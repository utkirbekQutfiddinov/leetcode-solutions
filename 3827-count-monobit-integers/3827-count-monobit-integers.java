class Solution {
    public int countMonobit(int n) {
        int count=0;
        int num=0, coeff=1;
        while(num<=n){
            count++;
            num=num+coeff;
            coeff*=2;
        }
        return count;
    }
}