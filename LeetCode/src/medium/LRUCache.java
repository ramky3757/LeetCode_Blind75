package medium;

import java.util.HashMap;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRU lru = new LRU(2);
		lru.setCache(1, 10);
		lru.setCache(2, 20);
		
		System.out.println(lru.getVal(1));
		
		lru.setCache(3, 30);
		System.out.println(lru.getVal(3));

	}

}


class LRU{
	int capacity;
	Node head;
	Node tail;
	
	HashMap<Integer, Node> cache ;
	
	LRU(int capacity){		
		this.capacity = capacity;
		head = new Node(0,0);
		tail = new Node(0,0);
		cache = new HashMap<Integer, Node>(capacity);
		head.next = tail;
		tail.pre = head;
		head.pre = null;
		tail.next = null;		
	}
	
	
	//Add Node next to head
	void addToHead(Node new_Node) {
		new_Node.next = head.next;
		new_Node.next.pre = new_Node;
		new_Node.pre = head;
		head.next = new_Node;
	}
	
	
	int getVal(int key) {		
		if(cache.containsKey(key)) {
			
			Node temp = cache.get(key);
			int result = temp.val;
			deleteNode(temp);
			addToHead(temp);
			return result;
		}
		
		return -1;
	}


	public void deleteNode(Node temp) {
		
		if(cache.containsKey(temp.key)) {			
			temp.pre.next = temp.next;
			temp.next.pre = temp.pre;
			temp = null;
		}
		
	}
	
	public void setCache(int key, int val) {
		
		if(cache.containsKey(key)) {
			Node temp = cache.get(key);
			temp.val = val;
			deleteNode(temp);
			addToHead(temp);		
		} else {
			
			if(cache.size()==capacity) {
				cache.remove(tail.pre.key);
				deleteNode(tail.pre);
				Node temp = new Node(key, val);
				addToHead(temp);	
				cache.put(key, temp);
				
			}else {
				
				Node temp = new Node(key, val);
				addToHead(temp);
				cache.put(key, temp);
			}			
		}		
	}
}


class Node{
	
	int key;
	int val;
	
	Node next;
	Node pre;
	
	Node(int key, int val){		
		this.key = key;
		this.val = val;		
		next = pre = null;
	}	
	
}
