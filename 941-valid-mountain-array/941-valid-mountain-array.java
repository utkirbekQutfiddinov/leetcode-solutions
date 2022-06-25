class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        
        if(arr[0]>arr[1]||arr[arr.length-1]>arr[arr.length-2]) 
            return false;
        
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                for(int j=i; j<arr.length-1; j++)
                    if(arr[j]<=arr[j+1]) return false;
                return true;
            } else if(arr[i]==arr[i+1]) break;
        }
        return false;
    }
}