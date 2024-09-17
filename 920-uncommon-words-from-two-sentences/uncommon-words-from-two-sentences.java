class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       Map<String,Integer> map=new HashMap<>();
       int count;

       for(String word: s1.split(" +")){
            count=map.getOrDefault(word,0);
            map.put(word,count+1);
       }

       for(String word: s2.split(" +")){
            count=map.getOrDefault(word,0);
            map.put(word,count+1);
       }

       Set<String> set=new HashSet<>();

       for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                set.add(entry.getKey());
            }
       }

       String[] res=new String[set.size()];

       int ind=0;
       for(String word: set){
        res[ind++]=word;
       }

    return res;
    }
}