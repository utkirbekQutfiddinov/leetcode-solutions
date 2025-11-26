class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=0, w2=0;
        char[] chars=new char[word1.length()+word2.length()];
        while(w1<word1.length() && w2<word2.length()){
            chars[w1+w2]=word1.charAt(w1);
            w1++;
            chars[w1+w2]=word2.charAt(w2);
            w2++;
        }

        while(w1<word1.length()){
            chars[w1+w2]=word1.charAt(w1);
            w1++;
        }

        while(w2<word2.length()){
            chars[w1+w2]=word2.charAt(w2);
            w2++;
        }

        return new String(chars);
    }
}