package easy;

import java.util.Stack;

public class ValidParanthesis {
	
	char[][] TOKENS = {{'{', '}'}, {'(',')'}, {'[',']'}};

	public static void main(String[] args) {
		
		ValidParanthesis vp = new ValidParanthesis();
		System.out.println(vp.isValid("()"));

	}

	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack <Character>();
		
		for(char c:s.toCharArray()) {
			
			if(isOpenTerm(c)) {
				stack.push(c);
			} else {
				
				if(stack.isEmpty() || !matches(stack.pop(), c)) {
					return false;
				}
			}
		}		
		
		return stack.isEmpty();
	}

	private boolean matches(char openTerm, char closeTerm) {
		
		for(char[] ch: TOKENS) {
			if(ch[0] == openTerm) {
				return ch[1] == closeTerm;
			}			
		}
		
		return false;
	}

	private boolean isOpenTerm(char c) {
		
		for(char[] ch: TOKENS) {
		
			if(ch[0] == c) {
				return true;
			}
		}
		
		return false;
	}
	
}
