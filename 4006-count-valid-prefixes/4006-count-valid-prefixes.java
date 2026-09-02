class Solution {
    public int countValidPrefixes(String s) {
        int zeros=0, ones=0;
        int good=0;

        for(char c: s.toCharArray()){
            if(c=='0'){
                zeros++;
            }else {
                ones++;
            }
            
            if(Math.abs(zeros-ones)<=1){
                good++;
            }
        }

        return good;
    }
}