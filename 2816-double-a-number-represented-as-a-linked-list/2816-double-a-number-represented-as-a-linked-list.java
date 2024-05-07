class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode res=reverse(head);
        res=multiply(res);
        res=reverse(res);
        return res;
    }
    
    private ListNode reverse(ListNode node){
        ListNode res=new ListNode(node.val);
        
        node=node.next;
        
        while(node!=null){
            res=new ListNode(node.val,res);
            node=node.next;
        }
        return res;
    }
    
    private ListNode multiply(ListNode node){
        int yodda=0;
        ListNode head=node;
        
        while(true){
            if(2*node.val+yodda>=10){
                node.val=(2*node.val+yodda)%10;
                yodda=1;
            }else {
                node.val=2*node.val+yodda;
                yodda=0;
            }
            if(node.next==null){
                if(yodda>0){
                    node.next=new ListNode(yodda);
                }
                break;
            }
            node=node.next;
        }
        
        return head;
    } 
}