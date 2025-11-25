class Solution {
    public int[] diStringMatch(String s) {
        int i=0,d=s.length();

        int[] perm=new int[s.length()+1];

        for(int j=0; j<s.length();j++){
            if(s.charAt(j)=='I'){
                perm[j]=i++;
            }else {
                perm[j]=d--;
            }
        }
        perm[s.length()]=i;

        return perm;
    }
}