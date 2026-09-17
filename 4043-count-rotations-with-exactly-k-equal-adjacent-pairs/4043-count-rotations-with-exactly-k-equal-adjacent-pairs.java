class Solution {
    public int countRotations(String s, int k) {
        int count=0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }

        
        if(s.charAt(0)==s.charAt(s.length()-1)) count++;
        
        if(count==k) return s.length()-count;
        
        if(k==count-1) return count;
        
        return 0;
    }
}