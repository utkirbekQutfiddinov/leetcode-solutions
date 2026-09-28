class Solution {
    public int maxDepth(String s) {
        int max=0,res=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                res++;
                if(res>max) max=res;
            } else if(s.charAt(i)==')') res--;
        }
        return max;
    }
}