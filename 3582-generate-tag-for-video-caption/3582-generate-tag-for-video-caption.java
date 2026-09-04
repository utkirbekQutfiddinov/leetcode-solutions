class Solution {
    public String generateTag(String caption) {
        caption=caption.trim();
        if(caption.length()==0) return "#";

        StringBuilder sb=new StringBuilder("#");
        String[] words=caption.split(" +");
        
        
        for(int i=0; i<words.length; i++){
            String word=words[i];
            String lower=word.toLowerCase();
            if(sb.length()==1){
                sb.append(lower);
            }else {
                sb.append((char)((int)lower.charAt(0)-32));
                sb.append(lower.substring(1));
            }

        }

        String res=sb.toString();

        return res.length()>100?res.substring(0,100):res;
    }
}