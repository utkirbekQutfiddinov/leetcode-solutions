package solutions;

public class $0496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            res[i]=find(nums1[i],nums2);
        }
        return res;
    }

    int find(int el, int[] nums2){
        int indexOf=-1;
        for(int i=0; i<nums2.length; i++)
            if(nums2[i]==el) {
                indexOf=i;
                break;
            }
        if(indexOf==-1) return -1;
        else{
            for(int i=(indexOf+1); i<nums2.length; i++){
                if(nums2[i]>el) return nums2[i];
            }
            return -1;
        }
    }
}
