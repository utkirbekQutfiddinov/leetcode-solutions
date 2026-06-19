class Solution {
    public int largestAltitude(int[] gain) {
       int currAltitude=0, maxAltitude=0;
       for(int i: gain){
        currAltitude+=i;
        maxAltitude=Math.max(maxAltitude,currAltitude);
       }
        return maxAltitude;
    }
}