package easy;

public class $1903 {
    public String largestOddNumber(String num) {
        int n=-1;
        for(int i=num.length()-1; i>=0; i--){
            if((int)num.charAt(i)%2==1){
                n=i; break;
            }
        }
        if(n==-1) return "";
        return num.substring(0,n+1);
    }
}
