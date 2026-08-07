class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels=Set.of('a','e','u','i','o','I','A','E','U','O');
        String[] words=sentence.split(" +");

        StringBuilder result=new StringBuilder();

        for(int i=0; i<words.length; i++){
            if(vowels.contains(words[i].charAt(0))){
                result
                .append(' ')
                .append(words[i])
                .append("ma");

            }else {
                result
                .append(' ')
                .append(words[i].substring(1))
                .append(words[i].charAt(0))
                .append("ma");
            }
            
            for(int j=0; j<=i; j++){
                result.append('a');
            }
        }
        return result.toString().trim();
    }
}