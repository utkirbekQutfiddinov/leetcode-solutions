class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int[] distances=new int[drones.length];

        for(int i=0; i<drones.length; i++){
            int[] drone=drones[i];
            distances[i]=Math.abs(drone[0]-target[0])+Math.abs(drone[1]-target[1]);
        }

        boolean found=false;
        int minInd=-1;

        for(int i=0; i<drones.length; i++){
            if(distances[i]<=drones[i][2]){
                if(found){
                    if(distances[minInd]>distances[i]){
                        minInd=i;
                    }
                }else {
                    found=true;
                    minInd=i;
                }
            }
        }

        return minInd;
    }
}