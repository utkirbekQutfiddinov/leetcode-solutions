class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet=Set.of(banned);

        Map<String, Integer> freqs=new HashMap<>();
        paragraph=paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("\\p{P}", " ").trim();


        String[] words=paragraph.split(" +");

        for(String word: words){
            if(!bannedSet.contains(word)){
                freqs.merge(word,1,Integer::sum);
            }
        }

        String word=null;
        int maxFreq=0,freq=0;

        for(String key: freqs.keySet()){
            freq=freqs.get(key);

            if(freq>maxFreq){
                word=key;
                maxFreq=freq;
            }
        }

        return word;

    }
}