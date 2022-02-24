package solutions;

public class $0557 {
    public String reverseWords(String s) {
        String result="";
        String word="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                if(result.equals("")) result=reverseWord(word);
                else result=result+" "+reverseWord(word);
                word="";
            } else {
                word+=s.charAt(i);
            }
        }
        if(result.equals("")) result=reverseWord(word);
        else result=result+" "+reverseWord(word);
        return result;
    }

    public String reverseWord(String word){
        if(word.length()<=1) return word;

        String result="";
        for(int i=word.length()-1;i>=0; i--)
            result+=word.charAt(i);
        while(result.charAt(0)==' '){
            result=result.substring(1);
        }
        while(result.charAt(result.length()-1)==' '){
            result=result.substring(0,result.length()-1);
        }
        return result;
    }
}
