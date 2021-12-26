package easy;

public class $0001 {
    public static void main(String[] args) {
     int[] nums={2,7,11,15};
     int target=9;
     int[] res=twoSum(nums,target);
     for(int i: res){
         System.out.print(i+" ");
     }

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int ind1,ind2;
        for(int i=0; i<nums.length; i++){
            ind1=i;
            ind2=findNum(nums,ind1,target);
            if(ind2!=-1) {
                result[0]=ind1;
                result[1]=ind2;
                break;
            }
        }
        return result;
    }

    public static int findNum(int[] nums, int num,int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==(target-nums[num])&&i!=num) return i;
        }
        return -1;
    }
}
