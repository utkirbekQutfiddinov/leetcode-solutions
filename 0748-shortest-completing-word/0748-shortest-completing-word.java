class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> plateMap=getFreqMap(licensePlate);
        String result=null;

        for(String word: words){
            if(isCompleting(plateMap, word)){
                if(result==null || word.length()<result.length()){
                    result=word;
                }
            }
        }
return result;

    }


    private Map<Character, Integer> getFreqMap(String word){
        Map<Character, Integer> map=new HashMap<>();

        for(char c: word.toLowerCase().toCharArray()){
            if(Character.isLetter(c))
            map.merge(c,1,Integer::sum);
        }
        return map;
    }

    private boolean isCompleting(Map<Character, Integer> map, String word){
        Map<Character, Integer> wmap=getFreqMap(word);

        for(char c: map.keySet()){
            if(!wmap.containsKey(c)||wmap.get(c)<map.get(c)){
                return false;
            }
        }

        return true;
    }
}