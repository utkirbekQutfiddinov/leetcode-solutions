class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder("");

        for(int i=0; i<s.length(); i=i+2*k){
            sb.append(reverse(s.substring(i,Math.min(i+k,s.length()))));
            if(i+k>s.length()){
                break;
            }
            sb.append(s.substring(i+k,Math.min(i+2*k,s.length())));
        }

        return sb.toString();
    }

    String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}