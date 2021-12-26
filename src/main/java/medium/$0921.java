package medium;

public class $0921 {
    public int minAddToMakeValid(String s) {
        String res=".";
        for(short i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                if(res.charAt(res.length()-1)=='('){
                    res=res.substring(0,(res.length()-1));
                } else res+=s.charAt(i);
            } else
                res+=s.charAt(i);
        }
        return (res.length()-1);
    }
}
