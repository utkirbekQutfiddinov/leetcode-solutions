class Solution {
    public int firstUniqChar(String s) {
        Set<Character> nonRepeated=new HashSet<>(), repeated=new HashSet<>();

        for(char c: s.toCharArray()){
            if(nonRepeated.contains(c)){
                repeated.add(c);
                nonRepeated.remove(c);
            }else if(!repeated.contains(c)){
                nonRepeated.add(c);
            }
        }

        if(nonRepeated.size()==0){
            return -1;
        }

        for(int i=0; i<s.length(); i++){
            if(nonRepeated.contains(s.charAt(i))){
                return i;
            }
        }

        return -1;
    }
}