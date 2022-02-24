package solutions;

import java.util.ArrayList;
import java.util.List;

public class $2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> answer=new ArrayList<>();
        int less=0;
        for(int i=0; i<nums.length; i++)
            if(nums[i]<target) less++;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) answer.add(less++);
        }
        return answer;
    }
}
