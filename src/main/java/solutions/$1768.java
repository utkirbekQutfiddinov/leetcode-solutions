package solutions;

public class $1768 {
    public String mergeAlternately(String word1, String word2) {

        String result="";

        while((word1.length()+word2.length())>0){
            if(word1.length()>0) {
                result+=word1.charAt(0);
                word1=word1.substring(1);}
            if(word2.length()>0){
                result+=word2.substring(0,1);
                word2=word2.substring(1);
            }
        }
        return result;
    }
}
