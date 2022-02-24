package solutions;

public class $0206 {
        public ListNode reverseList(ListNode head) {
            ListNode root=null,curr;
            while(Objects.nonNull(head)){
                curr=root;
                root=new ListNode();
                root.val=head.val;
                root.next=curr;
                head=head.next;
            }
            return root;
        }
    }
