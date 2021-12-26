package easy;

import dataStructures.ListNode;

import java.util.Objects;
import java.util.Stack;

public class $0234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode cl=head;
        while(Objects.nonNull(head)){
            stack.push(head.val);
            head=head.next;
        }
        while(Objects.nonNull(cl)){
            if(cl.val!=stack.pop()) return false;
            cl=cl.next;
        }
        return true;
    }
}
