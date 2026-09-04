class Solution {
    public int minDeletion(String s, int k) {
        int[] freqs=new int[26];
        for(char c: s.toCharArray()){
            freqs[c-'a']++;
        }

        Arrays.sort(freqs);
        int res=0;
        for(int i=freqs.length-k-1; i>=0; i--){
            res+=freqs[i];
        }
        return res;
    }
}