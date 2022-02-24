package solutions;

public class $1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res=setter(res,nums[i],index[i]);
        }
        return res;
    }

    int[] setter(int[] n, int num, int index){
        for(int i=n.length-1; i>index; i--){
            n[i]=n[i-1];
        }
        n[index]=num;
        return n;
    }
}
