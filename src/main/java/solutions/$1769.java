package solutions;

public class $1769 {
    public int[] minOperations(String boxes) {
        int[] res=new int[boxes.length()];
        for(int i=0; i<res.length;i++){
            for(int j=0; j<res.length; j++){
                if((int)boxes.charAt(j)==49)
                    res[i]+=Math.abs(i-j);
            }
        }
        return res;
    }
}
