class Solution {
    public String reversePrefix(String word, char ch) {
     int idx=word.indexOf(ch);
        if(idx<0) return word;
        StringBuilder sb=new StringBuilder();
        
        int i=idx;
        while(i>=0){
            sb.append(word.charAt(i--));
        }
        
        sb.append(word.substring(idx+1));
        
        return sb.toString();
    }
}