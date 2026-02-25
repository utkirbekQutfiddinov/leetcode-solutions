class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(shouldSwap(arr[i],arr[j])){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    private boolean shouldSwap(int a, int b){
        int a1=countOnes(Integer.toBinaryString(a));
        int b1=countOnes(Integer.toBinaryString(b));

        if(a1>b1){
            return true;
        }else if (a1==b1 && a>b){
            return true;
        }else {
            return false;
        }
    }

    private int countOnes(String bits){
        int count=0;

        for(char c: bits.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
}