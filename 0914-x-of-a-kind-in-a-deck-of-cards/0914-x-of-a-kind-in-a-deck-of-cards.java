class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
       Map<Integer, Integer> freqs=new HashMap<>();

        for(int i: deck){
            freqs.merge(i,1,Integer::sum);
        }

        if(freqs.size()==1){
            for(int key: freqs.keySet()){
                if(freqs.get(key)>1) return true;
                else return false;
            }
        }

        int freq1=-1,freq2=-1, gcd=-1;

        for(int key: freqs.keySet()){
            if(freq1==-1){
                freq1=freqs.get(key);
                continue;
            }else if(freq2==-1){
                freq2=freqs.get(key);
                gcd=gcd(freq1,freq2);
                if(gcd==1){
                    return false;
                }
                continue;
            }
            gcd=gcd(gcd,freqs.get(key));

            if(gcd==1){
                return false;
            }
        } 
        return true;
    }
     int gcd(int a, int b) {
        if (b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
}