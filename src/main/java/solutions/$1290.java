package solutions;

import dataStructures.ListNode;

import java.util.Objects;

public class $1290 {
    public int getDecimalValue(ListNode head) {
        String s="";
        while(Objects.nonNull(head)){
            s+=String.valueOf(head.val);
            head=head.next;
        }
        int res=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                res+=Math.pow(2,(s.length()-i-1));
            }
        }
        return res;
    }
}
