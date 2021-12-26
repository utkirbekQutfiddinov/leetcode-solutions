package easy;

public class $0009 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        for(int i=0; i<=(s.length()/2-1); i++)
            if(!s.substring(i,i+1).equals(s.substring(s.length()-1-i,s.length()-i)))               return false;
        return true;
    }
}
