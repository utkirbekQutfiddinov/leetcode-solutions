class Solution {
    public String longestPalindrome(String s) {
        char[] ch=s.toCharArray();
        int l=-1,r=-1;
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(ch,i,j) && (j-i+1)>(r-l)){
                    l=i;
                    r=j+1;
                }
            }
        }
        return s.substring(l,r);
    }


    boolean isPalindrome(char[] ch, int i, int j){

        while(i<=j){
            if(ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}