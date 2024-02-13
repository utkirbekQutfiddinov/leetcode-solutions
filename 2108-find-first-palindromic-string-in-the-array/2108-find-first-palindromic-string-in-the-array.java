class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            if(isPalindromic(word)) return word;
        }
        
        return "";
    }
    
    private boolean isPalindromic(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}