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
          //  System.out.print("i="+i+", r="+r+", [");
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
            
            //for(int j=0; j<arr.length; j++){
             //   if(j==arr.length-1)
            // System.out.print(arr[j]+"]"); 
             //else
            // System.out.print(arr[j]+", ");   
          //  }
            
           // System.out.println("i="+i+", r="+r+";");
        }


    }
}