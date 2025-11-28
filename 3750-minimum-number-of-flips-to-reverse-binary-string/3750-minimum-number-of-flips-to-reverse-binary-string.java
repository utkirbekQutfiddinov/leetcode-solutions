class Solution {
    public int minimumFlips(int n) {
        int res=0;
        String s=Integer.toBinaryString(n);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
               res++; 
            }
        }

        return res;
    }
}