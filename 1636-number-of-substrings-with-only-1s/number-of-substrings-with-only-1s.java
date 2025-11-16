class Solution {
    public int numSub(String s) {
        long count=0;

        long res=0;

        for(char c: s.toCharArray()){
            if(c=='1'){
                count++;
            }else {
                res+=(count*(count+1))/2;
                res%=1000000007;
                count=0;
            }
        }
        res+=(count*(count+1))/2;
        res%=1000000007;

        return (int)res;
    }
}