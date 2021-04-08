package easy;

import java.util.Stack;

public class PalindromeLinkedList {

	public static void main(String[] args) {
	

	}
	
	
public boolean isPalindrome(ListNode head) {
        
        ListNode sl_ptr = head;
        ListNode curr = head;
        boolean isPalin = false;
        
        Stack<ListNode> stack = new Stack<ListNode>();
        
        while(sl_ptr!=null){
            
            stack.push(sl_ptr);
            sl_ptr = sl_ptr.next;
        }
        
        while(curr!=null){
            
            ListNode temp = stack.pop();
            
            if(temp.val == curr.val){
                isPalin = true;
            }else{
                isPalin = false;
                break;
            }
            
            curr = curr.next;
        }
        
        return isPalin;
    }

}



class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
