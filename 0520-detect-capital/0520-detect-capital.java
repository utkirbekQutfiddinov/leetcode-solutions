class Solution {
    public boolean detectCapitalUse(String word) {
        int lowers=0, uppers=0;

        for(char c: word.toCharArray()){
            if(c<97){
                if(lowers>0){
                    return false;
                }
                uppers++;
            }else {
                if(uppers>1){
                    return false;
                }
                lowers++;
            }
        }

        return uppers==1 || uppers==word.length() || lowers==word.length();
    }
}