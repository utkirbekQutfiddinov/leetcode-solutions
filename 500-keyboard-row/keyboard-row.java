class Solution {
    public String[] findWords(String[] words) {
         List<Set<Character>> rows=List.of(
                Set.of('q','w','e','r','t','y','u','i','o','p'),
                Set.of('a','s','d','f','g','h','j','k','l'),
                Set.of('z','x','c','v','b','n','m')
        );

        List<String> res=new ArrayList<>();
        for(String s: words){
            for(int j=0; j<3; j++){
                if(rows.get(j).containsAll(getSet(s.toLowerCase()))){
                    res.add(s);
                }
            }
        }


        return res.toArray(new String[0]);

    }

    private Set<Character> getSet(String s){
        Set<Character> set=new HashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }
        return set;
    }
}