class Solution {
    public String sortString(String s) {
        int[] count=new int[26];
        StringBuilder sb=new StringBuilder("");
        
        for(int i=0; i<s.length(); i++){
            count[(int)s.charAt(i)-97]++;
        }
        
        while(true){
            for(int i=0; i<26; i++){
                if(count[i]>0) {
                    sb.append((char)(i+97));
                    count[i]--;
                }
            }
            
            if(sb.length()==s.length()) break;
            
            for(int i=25; i>=0; i--){
                if(count[i]>0) {
                    sb.append((char)(i+97));
                    count[i]--;
                }
            }
            
            if(sb.length()==s.length()) break;  
        }
        
        return sb.toString();
    }
}