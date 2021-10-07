package stack.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ExpressionValidityUsingStack {
	private static final Map<Character, Character> matchingParamMap = new HashMap<>();
	private static final Set<Character> openingParamSet = new HashSet<>();

	static {
		matchingParamMap.put(')', '(');
		matchingParamMap.put('}', '{');
		matchingParamMap.put(']', '[');
		openingParamSet.addAll(matchingParamMap.values());
	}

	public static boolean isValid(String expr) {
		Stack<Character> charStack = new Stack<>();
		for (int i = 0; i < expr.length(); i++) {
			if (openingParamSet.contains(expr.charAt(i))) {
				charStack.push(expr.charAt(i));
			}  
			if (matchingParamMap.containsKey(expr.charAt(i))) {
				Character lastParam = charStack.pop();
				if (lastParam != matchingParamMap.get(expr.charAt(i))) {
					return false;
				}
			}

		}
		// important line
		return charStack.isEmpty();

	}

	public static void main(String[] args) {
		String str1 = "{[()]}";
		String str2 = "{{[()]";
		System.out.println("is Str1 is valid? " + isValid(str1));
		System.out.println("is Str2 is valid? " + isValid(str2));

	}

}
