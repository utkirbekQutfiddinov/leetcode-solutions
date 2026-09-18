class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int count=0;
        while(count<=n*n){
            if(count*w>maxWeight){
                break;
            }
            count++;
        }
        return count-1;
    }
}