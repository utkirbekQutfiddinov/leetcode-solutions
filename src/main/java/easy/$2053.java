package easy;

public class $2053 {
    public String kthDistinct(String[] arr, int k) {
        int[] occ=new int[arr.length];
        for(int i=0; i<(arr.length-1); i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    occ[i]=2;
                    occ[j]=2;
                }
            }
        }
        int ind=0;
        for(int i=0; i<arr.length; i++){
            if(occ[i]<2) ind++;
            if(ind==k) return arr[i];
        }
        return "";
    }

}
