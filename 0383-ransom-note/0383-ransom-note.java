class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> noteMap=new HashMap<>(), magMap=new HashMap<>();

        for(char c: ransomNote.toCharArray()){
            noteMap.merge(c,1,Integer::sum);
        }

        for(char c: magazine.toCharArray()){
            magMap.merge(c,1,Integer::sum);
        }


        for(char c: noteMap.keySet()){
            if(magMap.getOrDefault(c,0)<noteMap.get(c)){
                return false;
            }
        }

        return true;
    }
}