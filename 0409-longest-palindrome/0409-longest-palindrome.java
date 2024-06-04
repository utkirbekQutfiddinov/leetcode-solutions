class Solution {
    public int longestPalindrome(String s) {
        int[] chars=new int[52];
        char c;
        for(int i=0; i<s.length(); i++){
            c=s.charAt(i);
            if(Character.isLowerCase(c))
            chars[(int)c-97]++;
            else
            chars[(int)c-65+26]++;
        }
        
        boolean toqbor=false;
        int juftSum=0;
        
        for(int i=0; i<52; i++){
            if(chars[i]%2==1) {
                toqbor=true;
                juftSum+=chars[i]-1;
            }else {
                juftSum+=chars[i];
            }
        }
        
        if(toqbor) return juftSum+1;
        else return juftSum;
    }
}