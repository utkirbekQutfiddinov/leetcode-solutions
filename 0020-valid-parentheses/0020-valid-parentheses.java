class Solution {
    public boolean isValid(String s) {
        char[] stack=new char[s.length()];
        int index=0;
        Map<Character,Character> pairs=Map.of('(',')','{','}','[',']');

        for(int i=0; i<s.length(); i++){
            if(pairs.containsKey(s.charAt(i))){
                stack[index]=s.charAt(i);
                index++;
            }else {
                if(index==0) return false;
                if(s.charAt(i)==pairs.get(stack[index-1])){
                    index--;
                }else{
                    return false;
                }
            }
        }
        return index==0;
    }
}