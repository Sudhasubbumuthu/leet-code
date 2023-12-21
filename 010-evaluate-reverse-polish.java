//150. Evaluate Reverse Polish Notation
import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String c : tokens) {
            int a, b;
            switch (c) {
                case "+":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(b + a);
                    break;
                case "-":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(b - a);
                    break;
                case "/":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(b / a);
                    break;
                case "*":
                    a = stk.pop();
                    b = stk.pop();
                    stk.push(a * b);
                    break;
                default:
                    stk.push(Integer.parseInt(c));
                    break;
            }
        }
        return stk.pop();
    }
}
