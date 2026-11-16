class Solution {
    public int numDecodings(String s) {
        int a=1, b=0;

        if(s.charAt(0)<='9' && s.charAt(0)>'0') b=1;

        for(int i=1; i<s.length(); i++){
            int curr=0;
            if(s.charAt(i)>'0' && s.charAt(i)<='9') curr+=b;
             if(isValidPair(s,i)) curr+=a;
             a=b;
             b=curr;
        }
        return b;
    }

    private boolean isValidPair(String s, int from){
        char c1=s.charAt(from-1), c2=s.charAt(from);
        int code=(c1-'0')*10+c2-'0';
        return code>=10 && code<=26;
    }
}