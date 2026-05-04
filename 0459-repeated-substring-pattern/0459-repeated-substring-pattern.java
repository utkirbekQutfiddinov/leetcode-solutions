class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb=null;
        
        for(int i=1; i<s.length(); i++){
            if(s.length()%i!=0){
                continue;
            }
            sb=new StringBuilder();

            while(sb.length()<s.length()){
                sb.append(s.substring(0,i));
            }
            if(sb.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
}