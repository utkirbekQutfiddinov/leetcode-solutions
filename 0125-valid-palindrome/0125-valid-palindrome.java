class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder("");
        
        s=s.toLowerCase();
        
        for(char c: s.toCharArray()){
            if(c>='a'&&c<='z'||c>='0'&&c<='9'){
                sb.append(c);
            }
        }
        
        return isPalindr(sb.toString());
    }
    
    private boolean isPalindr(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}