class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder s1=getBits(start), s2=getBits(goal);

        if(s1.length()>s2.length()){
            int dif=s1.length()-s2.length();


            for(int i=0; i<dif; i++){
                s2.insert(0,'0');
            }
        }else {
            int dif=s2.length()-s1.length();


            for(int i=0; i<dif; i++){
                s1.insert(0,'0');
            }
        }

        int count=0;

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }

        return count;

    }


    private StringBuilder getBits(int num){
        StringBuilder sb=new StringBuilder("");

        while(num!=0){
            sb.insert(0,num%2);
            num/=2;
        }

        return sb;
    }
}