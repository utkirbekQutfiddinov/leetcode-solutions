class Solution {
    public boolean scoreBalance(String s) {
        int overallScore=0;
        for(char c: s.toCharArray()){
            overallScore+=c-'a'+1;
        }

        int currScore=0;
        for(char c: s.toCharArray()){
            currScore+=c-'a'+1;
            if(2*currScore==overallScore){
                return true;
            }
        }
        return false;
    }
}