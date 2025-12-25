class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> transformations=new HashSet<>();

        StringBuilder sb=null;

        for(String word: words){
            sb=new StringBuilder("");
            for(char c: word.toCharArray()){
                sb.append(morse[c-97]);
            }
            transformations.add(sb.toString());
        }

        return transformations.size();
    }
}