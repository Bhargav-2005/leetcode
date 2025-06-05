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
    public void reorderList(ListNode head) {
        if(head==null) return ;
        ListNode m=head,e=head;
        while(e!=null && e.next!=null){
            m=m.next;
            e=e.next.next;
        }
        ListNode mid=m.next;//second
        m.next=null;
        ListNode temp=null;//node
        while(mid!=null){
            ListNode temp1=mid.next;//temp
            mid.next=temp;
            temp=mid;
            mid=temp1;
        }
        ListNode fst=head;
        mid=temp;
        while(mid!=null){
            ListNode tmp=fst.next,tmp1=mid.next;
            fst.next=mid;
            mid.next=tmp;
            fst=tmp;
            mid=tmp1;
        }
    }
}