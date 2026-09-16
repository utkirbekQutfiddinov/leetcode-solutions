class Solution {
    public int vowelConsonantScore(String s) {
        Set<Character> vowels=Set.of('a','e','u','i','o');
        int c=0,v=0;
        for(char ch: s.toCharArray()){
                if(vowels.contains(ch)){
                    v++;
                    continue;
                }

                if(ch>='a' && ch<='z'){
                    c++;
                }
        }
        
        if(c>0){
            return (int) Math.floor(v/c);
        }else{
            return 0;
        }
    }
}