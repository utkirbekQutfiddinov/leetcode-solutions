package solutions;

public class $0941 {
    public int[] diStringMatch(String s) {
        int[] res=new int[s.length()+1];
        int forD=s.length();
        int forI=0,i;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i)=='D')
                res[i]=forD--;
            else res[i]=forI++;
        }
        res[i]=forD;
        return res;
    }
}
