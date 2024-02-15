class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int[] distances=new int[s.length()];
        
        
        int left=0,right=0;
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)==c){
                distances[i]=0;
                continue;
            }
            
            for(left=i; left>=0&&s.charAt(left)!=c; left--){}
            
            left=left==-1?-1*s.length()*2:left;
            
            for(right=i; right<s.length()&&s.charAt(right)!=c; right++){}
            
            right=right==s.length()?s.length()*2:right;
            
            distances[i]=Math.min(Math.abs(left-i),Math.abs(right-i));
            
        }
        return distances;
    }
}