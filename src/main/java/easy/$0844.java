package easy;

public class $0844 {
    public boolean backspaceCompare(String s, String t) {

        String s1="",s2="";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                if(s1.length()>0)
                    s1=s1.substring(0,(s1.length()-1));
            } else
                s1+=s.charAt(i);
        }

        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(s2.length()>0)
                    s2=s2.substring(0,(s2.length()-1));
            } else
                s2+=t.charAt(i);
        }

        return s1.equals(s2);
    }

}
