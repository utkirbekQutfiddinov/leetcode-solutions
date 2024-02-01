class Solution {
    public int countKeyChanges(String s) {
        int res=0;
        for(int i=0; i<s.length()-1; i++){
            if(isChanged(s.charAt(i), s.charAt(i+1))) res++;
        }
        
        return res;
    }
    
    private boolean isChanged(char c1, char c2){
        int diff=Math.abs((int)c1-(int)c2);
        
        return diff!=32&&diff!=0;
    }
}