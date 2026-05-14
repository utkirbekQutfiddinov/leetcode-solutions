class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count1, count2)) return true;

        for (int right = s1.length(); right < s2.length(); right++) {
            count2[s2.charAt(right) - 'a']++;           // add new right
            count2[s2.charAt(right - s1.length()) - 'a']--; // remove old left
            if (Arrays.equals(count1, count2)) return true;
        }

        return false;
    }
}