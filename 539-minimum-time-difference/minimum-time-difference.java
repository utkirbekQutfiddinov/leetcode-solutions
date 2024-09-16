class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes=new int[timePoints.size()];

        String[] points;
        int hour, minute;

        for(int i=0; i<timePoints.size(); i++){
            points=timePoints.get(i).split(":");
            hour=Integer.parseInt(points[0]);
            minute=Integer.parseInt(points[1]);

            minutes[i]=hour*60+minute;
        }


        Arrays.sort(minutes);

        int javob=24*60-minutes[minutes.length-1]+minutes[0];

        for(int i=1; i<minutes.length; i++){
            javob=Math.min(javob, minutes[i]-minutes[i-1]);
        }

        return javob;
    }
}