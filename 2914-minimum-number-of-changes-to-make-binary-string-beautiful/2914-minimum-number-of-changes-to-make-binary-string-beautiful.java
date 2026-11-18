class Solution {
    public int minChanges(String s) {
        int zeros=0, ones=0;
        int res=0;

        for(char c: s.toCharArray()){
            if(c=='0'){
                zeros++;
            }else{
                ones++;
            }

            if(zeros%2==0 && ones==0){
                zeros=0;
            }
            if(ones%2==0 && zeros==0){
                ones=0;
            }

            if((zeros+ones)>2 && (zeros+ones)%2==0){
                if(zeros>ones){
                    res+=ones;
                }else{
                    res+=zeros;
                }
                zeros=0;
                ones=0;
            }
        }
      if(zeros>ones){
                    res+=ones;
                }else{
                    res+=zeros;
                }
                zeros=0;
                ones=0;
  
        return res;
    }
}