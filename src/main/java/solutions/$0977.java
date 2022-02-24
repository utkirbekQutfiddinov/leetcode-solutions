package solutions;

import java.util.Arrays;

public class $0977 {
    public int[] sortedSquares(int[] nums) {
        int[] sq=new int[nums.length];
        for(short i=0; i<nums.length; i++)
            sq[i]=nums[i]*nums[i];
        Arrays.sort(sq);
        return sq;
    }
}
