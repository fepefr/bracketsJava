package test.bravi.brackets;

import java.util.Stack;

public class App {
	public static void main(String[] args) {
		//System.out.println(isValid(args[0]));
		System.out.println(isValid("[[]]]]][][}]"));
	}

	public static boolean isValid(String bracketString) {
		
		if((bracketString.length()%2) != 0)
			return false;

		Stack<Character> stack = new Stack<>();
		for (char c : bracketString.toCharArray()) {
			switch (c) {
			case '{':
				stack.push(c);
				break;
			case '}':
				if (stack.isEmpty()) {
					return false;
				}
				Character last1 = stack.pop();
				if (last1 != '{') {
					return false;
				}
				break;
			case '(':
				stack.push(c);
				break;
			case ')':
				if (stack.isEmpty()) {
					return false;
				}
				Character last2 = stack.pop();
				if (last2 != '(') {
					return false;
				}
				break;
			case '[':
				stack.push(c);
				break;
			case ']':
				if (stack.isEmpty()) {
					return false;
				}
				Character last3 = stack.pop();
				if (last3 != '[') {
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();
	}
}
