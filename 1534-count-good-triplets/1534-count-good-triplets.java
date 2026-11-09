class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res=0;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int z=j+1; z<arr.length; z++){
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[z])<=b && Math.abs(arr[i]-arr[z])<=c){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}