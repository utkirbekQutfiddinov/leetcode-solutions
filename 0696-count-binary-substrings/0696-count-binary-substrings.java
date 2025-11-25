class Solution {
    public int countBinarySubstrings(String s) {
        if(s.length()==0) return 0;
        int prev=0, curr=1, res=0;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }else {
                res+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
                res+=Math.min(prev,curr);
        
        return res;
    }
}