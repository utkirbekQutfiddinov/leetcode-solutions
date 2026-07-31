class Solution {
    public int minimumPushes(String word) {

        Map<Integer, Integer> freqs=new HashMap<>();//harf,takrorlanish
        for(char c: word.toCharArray()){
            freqs.merge(c-'a',1,Integer::sum);
        }

        System.out.println(freqs);
        Map<Integer, Integer> freq1=new TreeMap<>((a,b)->b-a);//takrorlanish,harf

        for(Integer key: freqs.keySet()){
            freq1.merge(freqs.get(key),1,Integer::sum);
        }

        int result=0, press=1, button=8, freq;

        for(Integer key: freq1.keySet()){
            freq=freq1.get(key);
            while(freq>0){

                if(button==0){
                    press++;
                    button=8;
                }
                
                result+=press*key;
                button--;
                freq--;
            }
        }

        return result;
    }
}