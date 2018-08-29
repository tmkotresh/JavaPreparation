package Collection;

import java.util.Stack;

public class TestStackDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		
		String card1 = "Jack : Diamonds";
		String card2 = "8 : Hearts";
		
		String card3 = "3 : Clubs";
		
		stack.push(card1);
		stack.push(card2);
		stack.push(card3);
		
		System.out.println(stack);
		
		String top = stack.peek();
		
		System.out.println(top);
		
		while(!stack.empty()) {
			String removedElement = stack.pop();
			
			System.out.println(removedElement);
		}
		
		
		Stack<Character> charStack = new Stack<Character>();
		
		String val = "Kotresh";
		
		for(int j =0; j<val.length();j++) {
			charStack.push(val.charAt(j));
		}
		
		String rev = "";
		for(int k=0;k<val.length();k++) {
			rev += charStack.pop();
			
		}
		
		System.out.println(rev);
		

	}

}
