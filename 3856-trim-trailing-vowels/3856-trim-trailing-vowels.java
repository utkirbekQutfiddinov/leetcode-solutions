class Solution {
    public String trimTrailingVowels(String s) {
        int to=s.length()-1;
        Set<Character> vowels=Set.of('e','u','i','o','a');
        while(to>=0 && vowels.contains(s.charAt(to))){
            to--;
        }
        return s.substring(0,to+1);
    }
}