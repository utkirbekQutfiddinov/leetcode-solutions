class Solution {
    public double angleClock(int hour, int minutes) {
        int totalMinutes=(hour%12)*60+minutes;
        double diff=Math.abs(totalMinutes/2.0-6.0*minutes);
        return Math.min(diff,360-diff);
    }
}