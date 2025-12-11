class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> maps=new HashMap<>(), mapt=new HashMap<>();

        for(char c: s.toCharArray()){
            maps.merge(c,1,Integer::sum);
        }

        for(char c: t.toCharArray()){
            mapt.merge(c,1,Integer::sum);
        }

        for(char c: mapt.keySet()){
            if(!maps.containsKey(c)||mapt.get(c)>maps.get(c)){
                return c;
            }
        }

        return '0';

    }
}