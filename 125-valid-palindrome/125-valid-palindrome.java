class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        String s2="";
        char q=0;
        for(int i=0; i<s1.length(); i++){
            q=s1.charAt(i);
            if(q>='a'&&q<='z'||q<='9'&&q>='0')
                s2+=q;
        }
        
        int l=0,r=s2.length()-1;
        while(r>l)
        {
            if(s2.charAt(l)!=s2.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}