class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] chars=new char[words.length];
        int index=0;
        int weight;
        for(String word: words){
            weight=0;

            for(char c: word.toCharArray()){
                weight+=weights[c-'a'];
            }

            chars[index++]=(char)(25-weight%26+97);
        }
        StringBuilder sb=new StringBuilder();
        for(char c: chars){
            sb.append(c);
        }

        return sb.toString();
    }
}