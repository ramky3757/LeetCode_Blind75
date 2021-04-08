package medium;

import java.util.HashMap;

public class ReorderList {

	public static void main(String[] args) {
		
		//Input: head = [1,2,3,4]
		//Output: [1,4,2,3]
	}
	
public void reorderList(ListNode head) {
        
        HashMap<Integer, ListNode> map = new HashMap<Integer, ListNode>();
        int counter =0;
        
        ListNode curr = head;
        
        while(curr!=null){
            counter++;
            map.put(counter,curr);
            curr = curr.next;
        }        
        curr = head;
        
        for(int i=1; i<=counter/2; i++){
            
                curr.next = map.get(counter-i+1);
                curr = curr.next;
                curr.next = map.get(i+1);
                curr = curr.next;                        
                curr.next = null;            
        }
	}

}

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
