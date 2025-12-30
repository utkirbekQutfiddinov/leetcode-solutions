class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap=new HashMap<>();
        
        int ord=0;

        for(char c: order.toCharArray()){
            orderMap.put(c,ord++);
        }

        for(int i=0; i<words.length-1; i++){
            if(!isOrdered(words[i],words[i+1],orderMap)){
                return false;
            }
        }

        return true;
    }

    private boolean isOrdered(String first, String second, Map<Character, Integer> orderMap){
        int f,s;
        for(int i=0; i<first.length() && i<second.length(); i++){
            f=orderMap.get(first.charAt(i));
            s=orderMap.get(second.charAt(i));
            if(f<s){
                return true;
            }else if(f>s){
                return false;
            }
        }

        if(second.length()<first.length()){
            return false;
        }

        return true;
    }
}