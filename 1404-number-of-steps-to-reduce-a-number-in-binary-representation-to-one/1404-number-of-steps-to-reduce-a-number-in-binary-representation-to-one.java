class Solution {
    public int numSteps(String s) {
        int step=0, rem=0;
        char[] c=s.toCharArray();
        for(int i=c.length-1; i>0; i--){

            if(rem==0 && c[i]=='0'){
                step++;
                continue;
            }

            if(rem==0 && c[i]=='1'){
                rem=1;
                step+=2;
                continue;
            }

            if(rem==1 && c[i]=='0'){
                rem=0;
                c[i]='1';
                i++;
                continue;
            }

            if(rem==1 && c[i]=='1'){
                step++;
                continue;
            }
           
        }

        if(rem>0){
            step++;
        }
        return step;
    }
}