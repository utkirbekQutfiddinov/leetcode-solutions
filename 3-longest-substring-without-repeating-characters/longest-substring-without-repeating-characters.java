class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        Set<Character> set=new HashSet<>();

        int left=0, right=0, result=0;

        boolean removed;

         while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                right++;
                result = Math.max(set.size(), result);
            }
        }


        return result;
    }
}