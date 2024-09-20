class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);

        int count=0;

        for(int i=sb.length()-1; i>=0; i--){
            if(isP(sb.substring(0,i+1))){
                break;
            }else {
                count++;
            }
        }


        StringBuilder orqa=new StringBuilder(s.substring(s.length()-count)).reverse();
        sb.insert(0,orqa);
        return sb.toString();

    }


    private boolean isP(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }

        return true;
    }
}