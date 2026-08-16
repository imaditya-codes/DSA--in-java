class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();
        int additions = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {

                if (!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    additions++;
                }
            }
        }

        return stack.size() + additions;
    }
}