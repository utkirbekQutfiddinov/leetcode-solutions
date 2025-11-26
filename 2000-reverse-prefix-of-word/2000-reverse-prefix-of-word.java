class Solution {
    public String reversePrefix(String word, char ch) {
        boolean isFound=false;

        StringBuilder sb=new StringBuilder("");

        for(char c: word.toCharArray()){
            if(!isFound){
                sb.insert(0,c);
            }else {
                sb.append(c);
            }
            
            if(c==ch){
                isFound=true;
            }
        }

        return isFound?sb.toString():word;
    }
}