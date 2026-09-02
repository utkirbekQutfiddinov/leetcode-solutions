class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int currentFloor=0;
        int result=0;
        for(int request: requests){
            result+=Math.abs(request-currentFloor);
            currentFloor=request;
        }
        return result;
    }
}