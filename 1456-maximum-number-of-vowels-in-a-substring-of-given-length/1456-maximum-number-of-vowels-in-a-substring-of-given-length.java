class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a','e','i','o','u');
        int curr = 0, res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) curr++;
            if (i >= k && vowels.contains(s.charAt(i - k))) curr--;
            res = Math.max(res, curr);
        }

        return res;
    }
}