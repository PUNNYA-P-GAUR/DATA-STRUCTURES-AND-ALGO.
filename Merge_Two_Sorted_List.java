
public class Solution {
    public static ListNode mergeTwoLists(ListNode L1,ListNode L2) {
        ListNode D=new ListNode(0);
        ListNode temp=D;
        while(L1!=null && L2!=null){
            if(L1.val <= L2.val){
                temp.next=L1;
                L1=L1.next;
            }
            else{
                temp.next=L2;
                L2=L2.next;
            }
            temp=temp.next;
        }
        if(L1==null){
            temp.next=L2;
        }
        else{
            temp.next=L1;
        }
        return D.next;
    }
}
//     public static void main(String[]args){
//         ListNode l1=new ListNode();
//         l1.insertLast(1);
//         l1.insertLast(2);
//         l1.insertLast(4);
//         ListNode l2=new ListNode();
//         l2.insertLast(1);
//         l2.insertLast(3);
//         l2.insertLast(4);
//         ListNode r=new ListNode();
//         r.head=mergeTwoLists(L1.head,L2.head);
//         r.display();
//     }
// }
