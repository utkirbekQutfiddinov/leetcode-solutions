class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left=0, right=0;
        int[] bp=new int[26];
        int[] bs=new int[26];
        for(char c: p.toCharArray()){
            bp[c-97]++;
        }

        List<Integer> res=new ArrayList<>();
        for(int i=0; i<p.length()&&i<s.length(); i++){
            bs[s.charAt(i)-97]++;
        }

        for(int i=p.length(); i<s.length(); i++){
            if(Arrays.equals(bp,bs)) res.add(i-p.length());
            bs[s.charAt(i-p.length())-97]--;
            bs[s.charAt(i)-97]++;
        }

            if(Arrays.equals(bp,bs)) res.add(s.length()-p.length());
            return res;
    }
}