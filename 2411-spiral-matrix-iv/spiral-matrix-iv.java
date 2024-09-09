/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res=new int[m][n];

        int l=0, r=n-1, t=0, b=m-1;

        while(true){
            for(int i=l; i<=r; i++){
                if(head==null){
                    res[t][i]=-1;
                }else {  
                res[t][i]=head.val;
                head=head.next;
                }
            }
            t++;
            if(t>b){
                break;
            }
            for(int i=t; i<=b; i++){
                if(head==null){
                    res[i][r]=-1;
                }else {  
                res[i][r]=head.val;
                head=head.next;
                }
            }
            r--;
            if(r<l){
                break;
            }
            for(int i=r; i>=l; i--){
                if(head==null){
                    res[b][i]=-1;
                }else {  
                res[b][i]=head.val;
                head=head.next;
                }
            }
            b--;
            if(b<t){
                break;
            }
            for(int i=b; i>=t; i--){
                if(head==null){
                    res[i][l]=-1;
                }else {  
                res[i][l]=head.val;
                head=head.next;
                }
            }
            l++;
            if(l>r){
                break;
            }

        }
        return res;
    }
}