class Solution {
    public List<String> commonChars(String[] words) {
        int[] chars=new int[26];
        int[] curr=new int[26];
        for(int i=0; i<words.length; i++){
            for(char c: words[i].toCharArray()){
                curr[c-'a']++;    
            }
            if(i==0){
                chars=curr;
            }else{
                for(int j=0; j<chars.length; j++){
                    chars[j]=Math.min(chars[j], curr[j]);
                }
            }
            curr=new int[26];
        }

        List<String> res=new ArrayList<>();
        for(int i=0; i<chars.length; i++){
            for(int j=0; j<chars[i]; j++){
                res.add((char)(i+'a')+"");
            }
        }
        return res;
    }
}