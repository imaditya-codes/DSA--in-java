

class MinStack {

    class Node {
        int val;
        int minTillNow;

        Node(int val, int minTillNow) {
            this.val = val;
            this.minTillNow = minTillNow;
        }
    }

    Stack<Node> st = new Stack<>();

    public void push(int value) {
        int minTillNow = st.isEmpty()
                ? value
                : Math.min(value, st.peek().minTillNow);

        st.push(new Node(value, minTillNow));
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().val;
    }

    public int getMin() {
        return st.peek().minTillNow;
    }
}