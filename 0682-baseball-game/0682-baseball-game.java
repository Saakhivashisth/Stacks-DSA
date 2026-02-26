class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newNum = top + stack.peek();
                stack.push(top);
                stack.push(newNum);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                int newNum = stack.peek() * 2;
                stack.push(newNum);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int i:stack){
            sum+=i;
        }
        return sum;
    }
}