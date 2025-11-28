class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int result=Integer.MAX_VALUE;

        //if tourist starts with land
        for(int i=0; i<landStartTime.length; i++){
            result=Math.min(result,getFinishTime(landStartTime[i]+landDuration[i],waterStartTime,waterDuration));
        }

         //if tourist starts with water
        for(int i=0; i<waterStartTime.length; i++){
            result=Math.min(result,getFinishTime(waterStartTime[i]+waterDuration[i],landStartTime,landDuration));
        }

        return result;

    }


    int getFinishTime(int now, int[] openings, int[] durations){
        int result=Integer.MAX_VALUE;
        for(int i=0; i<openings.length; i++){
            if(openings[i]<=now){
                result=Math.min(durations[i]+now,result);
            }else {
                result=Math.min(result,openings[i]+durations[i]);
            }
        }

        return result;
    }
}