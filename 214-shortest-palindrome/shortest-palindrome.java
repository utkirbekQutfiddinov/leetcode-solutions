class Solution {
    public String shortestPalindrome(String s) {
        int count=0;


        for(int i=s.length()-1; i>=0; i--){
            if(isPalindrome(s.substring(0,i+1))){
                break;
            }else {
                count++;
            }
        }

        System.out.println(count);

        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb1=new StringBuilder(s.substring(s.length()-count));

        sb.insert(0,sb1.reverse().toString());

        return sb.toString();
    }

    private boolean isPalindrome(String s){
        for(int i=0; i<s.length()/2+1; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    
}