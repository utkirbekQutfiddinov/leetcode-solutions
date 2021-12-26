package easy;

public class $1720 {
    public int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        for(int i=0; i<arr.length; i++){
            if(i==0) arr[i]=first;
            else arr[i]=arr[i-1]^encoded[i-1];
        }
        return arr;
    }
}
