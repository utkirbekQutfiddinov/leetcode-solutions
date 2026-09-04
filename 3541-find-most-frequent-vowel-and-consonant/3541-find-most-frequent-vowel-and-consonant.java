class Solution {
    public int maxFreqSum(String s) {
        Set<Integer> vowels=Set.of('a'-'a','e'-'a','i'-'a','o'-'a','u'-'a');
        int[] freqs=new int[26];

        for(char c: s.toCharArray()){
            freqs[c-'a']++;
        }

        int maxVowel='a'-'a', maxConsonant='b'-'a';

        for(int i=0; i<freqs.length; i++){
            if(vowels.contains(i) && freqs[i]>freqs[maxVowel]){
                maxVowel=i;
            }
            
            if(!vowels.contains(i) && freqs[i]>freqs[maxConsonant]){
                maxConsonant=i;
            }
        }

        return freqs[maxVowel]+freqs[maxConsonant];
    }
}