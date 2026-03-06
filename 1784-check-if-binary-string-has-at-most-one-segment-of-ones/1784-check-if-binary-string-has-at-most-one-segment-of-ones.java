class Solution {
    public boolean checkOnesSegment(String s) {
        boolean seen=s.charAt(0)=='1';

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)=='1' && s.charAt(i-1)=='0'){
                if(seen){
                    return false;
                }
                seen=true;
            }
        }
        return true;
    }
}