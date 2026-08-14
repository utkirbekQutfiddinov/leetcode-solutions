class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen=0, currLen=0, left=0, right=0;
        int[] occ=new int[26];

        while(right<s.length()){
            int rc=s.charAt(right)-'a';
        
            if(occ[rc]>=2){
                int lc=s.charAt(left)-'a';
                occ[lc]--;
                left++; 
                currLen--;
            }else{
                occ[rc]++;
                right++;
                currLen++;
                maxLen=Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }
}