class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length], stack=new int[temperatures.length];
        int index=-1;
        for(int i=0; i<temperatures.length; i++){
            while(index>-1 && temperatures[i]>temperatures[stack[index]]){
                res[stack[index]]=i-stack[index];
                index--;
            }
            stack[++index]=i;
        }

        return res;
    }
}