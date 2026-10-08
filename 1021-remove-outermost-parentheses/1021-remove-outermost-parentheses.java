class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') {
                sb.append(s.charAt(i));
                c++;
            }
            else {
                sb.append(s.charAt(i));
                c--;
            }
            
            if(c==0 && sb.toString().length()>0){
                res.append(sb.toString().substring(1,sb.toString().length()-1));
                sb=new StringBuilder();
            }
        }
        return res.toString();
    }
}