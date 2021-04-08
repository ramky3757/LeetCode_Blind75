package hard;

public class MergekSortedLists {

	public static void main(String[] args) {
		
		
		MergekSortedLists m = new MergekSortedLists();
		// [[1,4,5],[1,3,4],[2,6]]

	}
	
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode head = new ListNode(0);
		ListNode ans = head;
		
		while(l1!=null && l2!=null) {
			
			if(l1.val<=l2.val) {
				
				head.next = l1;
				head = head.next;
				l1 = l1.next;
				
			} else {
				
				head.next = l2;
				head = head.next;
				l2 = l2.next;
			}		
			
		}
		
		if(l1==null) head.next=l2;
		if(l2==null) head.next = l1;
		
		return ans.next;
	}
	
public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length==0) return null;
        ListNode head = new ListNode(0);
        
        if(lists.length>1){
            head = mergeTwoLists(lists[0], lists[1]);
        }
        
        for(int i=2; i<lists.length;i++){
            head = mergeTwoLists(head, lists[i]);            
        }
        
        return head;
    }

}


class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
