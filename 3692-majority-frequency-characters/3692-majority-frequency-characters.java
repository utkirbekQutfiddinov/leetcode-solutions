class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freqs=new HashMap<>();

        for(char c: s.toCharArray()){
            freqs.merge(c,1,Integer::sum);
        }

        Map<Integer, List<Character>> groups=new HashMap<>();
        for(char c: freqs.keySet()){
            int freq=freqs.get(c);
            List<Character> group=groups.getOrDefault(freq,new ArrayList<>());
            group.add(c);
            groups.put(freq, group);
        }

        int majority=0, freq=0;
        for(int size: groups.keySet()){
            List<Character> group=groups.get(size);
            
            if(group.size()>majority){
                majority=group.size();
                freq=size;
            }

            if(group.size()==majority && size>freq){
                majority=group.size();
                freq=size;
            }
        }

        StringBuilder sb=new StringBuilder();
        List<Character> group=groups.get(freq);

        for(char c: group){
            sb.append(c);
        }
       
        return sb.toString();
    }
}