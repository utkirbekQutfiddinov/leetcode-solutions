package solutions;

public class $0485 {
        public int findMaxConsecutiveOnes(int[] nums) {
            int res=0, curr=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]==0)
                    curr=0;
                else curr++;
                if(curr>res) res=curr;
            }
            return res;
        }
    }
