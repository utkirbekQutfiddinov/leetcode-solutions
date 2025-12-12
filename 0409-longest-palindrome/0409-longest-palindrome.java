class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freqs=new HashMap<>();

        for (char c : s.toCharArray()) {
            freqs.merge(c, 1, Integer::sum);
        }

        int len=0;
        boolean toqMavjud=false;

        for(int freq: freqs.values()){
            if(freq%2==0){
                len+=freq;
            }else {
                len+=freq-1;
                toqMavjud=true;
            }
        }

        return toqMavjud?len+1:len;
    }
}