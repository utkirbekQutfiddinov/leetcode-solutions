package solutions;

public class $0013 {
    public static void main(String[] args) {
        System.out.println(romanToInt("XXVI"));
    }
    public static int romanToInt(String s) {
        if(s.length()==0) return 0;
        int r=getInt(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--){
            if(getInt(s.charAt(i))<getInt(s.charAt(i+1))) r-=getInt(s.charAt(i));
            else r+=getInt(s.charAt(i));
        }
        return r;
    }

    public static int getInt(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
