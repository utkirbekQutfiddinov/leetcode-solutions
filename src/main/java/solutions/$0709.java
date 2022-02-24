package solutions;

public class $0709 {
    public String toLowerCase(String s) {
        String result="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z') result=result+(char)((int)s.charAt(i)+32);
            else result=result+s.charAt(i);
        }
        return result;
    }
}
