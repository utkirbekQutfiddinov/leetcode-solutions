class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] startingParts=startTime.split(":"), endingParts=endTime.split(":");

        int result=0;
        result+=(Integer.parseInt(endingParts[0])-Integer.parseInt(startingParts[0]))*3600;
        result+=(Integer.parseInt(endingParts[1])-Integer.parseInt(startingParts[1]))*60;
        result+=(Integer.parseInt(endingParts[2])-Integer.parseInt(startingParts[2]))*1;
        return result;
    }
}