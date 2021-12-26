package easy;

public class $0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[n+m];
        int n1=0,n2=0,ind=0;
        //putting elements in non-decreasing-order
        while(n1!=m&&n2!=n){
            if(nums1[n1]<nums2[n2])
                res[ind++]=nums1[n1++];
            else res[ind++]=nums2[n2++];
        }

        //putting last elements to res array
        if(n1==m)
            for(int i=ind; i<(n+m); i++){
                res[i]=nums2[n2++];
            }
        else
            for(int i=ind; i<(n+m); i++){
                res[i]=nums1[n1++];
            }

        //putting back res array's elements to nums1 array
        for(int i=0; i<(n+m); i++)
            nums1[i]=res[i];
    }
}
