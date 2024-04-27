import java.util.*;
public class BalacedBrackets
{
	// function to check if brackets are balanced
	private static boolean isBracketBalance(String _bracketString) {

		Deque<Character> charStack = new ArrayDeque<Character>();

		for (int i = 0; i < _bracketString.length(); i++) {
			if (_bracketString.charAt(i) == '(' || _bracketString.charAt(i) == '[' || _bracketString.charAt(i) == '{') {
				charStack.push(_bracketString.charAt(i));
				continue;
			}

			if (_bracketString.isEmpty()) {
				return false;
			}

			char check;
			switch (_bracketString.charAt(i)) {
			case ')':
				check=charStack.pop();
				if (check == '[' || check == '{')
					return false;
				break;
			case ']':
				check=charStack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			case '}':
				check=charStack.pop();
				if (check == '[' || check == '(')
					return false;
				break;
			}

		}
		return charStack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isBracketBalance("{[]()}"));
	}
}
