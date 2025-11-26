class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       int res=0;
       boolean isOk=false;

       for(int i=0; i<arr1.length; i++){
            isOk=true;
            for(int j=0; j<arr2.length; j++){
                if(Math.abs(arr2[j]-arr1[i])<=d){
                    isOk=false;
                    break;
                }
            }
            if(isOk){
                res++;
            }
       }

        return res;
    }
}