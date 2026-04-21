class Solution {
    public boolean isValid(String s) {
        

	Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char el = s.charAt(i);

			if (el == '[' || el == '(' || el == '{') {
				st.push(el);
			} else {

				if (st.isEmpty()) {
					//System.out.println(false);
					return false;
				}

				char top = st.pop();

				if (el == ')' && top != '(' || el == ']' && top != '[' ||el == '}' && top != '{') {
				//	System.out.println(false);
					return false;
				}
			}

		}

return st.isEmpty();
    }
}
