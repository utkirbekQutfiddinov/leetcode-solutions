package solutions;

public class $1021 {
    public String removeOuterParentheses(String s) {
        int opened=0, closed=0;
        String res="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') opened++;
            if(s.charAt(i)==')') closed++;
            if(opened==closed) {opened=0; closed=0;}
            if(!(opened==1||opened==closed)) res+=s.charAt(i);
        }
        return res;
    }
}
