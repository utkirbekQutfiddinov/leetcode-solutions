class Solution {
    public void duplicateZeros(int[] arr) {
        int i, resLen=0;
        for(i=0; resLen<arr.length; i++){
            if(arr[i]==0){
                resLen++;
            }
            resLen++;
        }
        i--;

        int l=0,r=arr.length-1;

        while(i>=0){
            if(arr[i]==0){
                if(resLen>arr.length){
                    arr[r]=0;
                    r--;
                    resLen--;
                }else {
                    arr[r]=0;
                    r--;
                    arr[r]=0;
                    r--;
                }
            }else {
                arr[r]=arr[i];
                r--;
            }
            i--;
        }


    }
}