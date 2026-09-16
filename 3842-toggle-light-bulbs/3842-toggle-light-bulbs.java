class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer, Integer> freqs=new HashMap<>();

        for(int bulb: bulbs){
            freqs.merge(bulb,1,Integer::sum);
        }

        List<Integer> res=new ArrayList<>();
        for(int bulb: freqs.keySet()){
            int count=freqs.getOrDefault(bulb,0);
            if(count%2==1){
                res.add(bulb);
            }
        }
        Collections.sort(res);
        return res;
    }
}