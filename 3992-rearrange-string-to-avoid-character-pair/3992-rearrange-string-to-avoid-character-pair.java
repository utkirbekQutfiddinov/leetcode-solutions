class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] freqs=new int[26];
        for(char c: s.toCharArray()){
            freqs[c-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        sb.append((""+y).repeat(freqs[y-'a']));
        
        freqs[y-'a']=0;
        sb.append((""+x).repeat(freqs[x-'a']));
        
        freqs[x-'a']=0;
        for(int i=0; i<26; i++){
            if(freqs[i]>0){
                sb.append((""+(char)('a'+i)).repeat(freqs[i]));
            }
        }
        return sb.toString();
    }
}