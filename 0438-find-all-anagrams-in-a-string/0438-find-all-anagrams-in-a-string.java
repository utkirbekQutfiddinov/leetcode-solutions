class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;

        int[] bp = new int[26];
        int[] bs = new int[26];

        for (char c : p.toCharArray()) bp[c - 'a']++;
        for (int i = 0; i < p.length(); i++) bs[s.charAt(i) - 'a']++;

        for (int i = p.length(); i < s.length(); i++) {
            if (Arrays.equals(bp, bs)) res.add(i - p.length());
            bs[s.charAt(i - p.length()) - 'a']--;
            bs[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(bp, bs)) res.add(s.length() - p.length());
        return res;
    }
}