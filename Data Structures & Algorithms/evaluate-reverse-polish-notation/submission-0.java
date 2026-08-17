class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String i : tokens) {
            if (i.equals("+") || i.equals("-") || i.equals("/") || i.equals("*")) {
                int b = stack.pop();  
                int a = stack.pop();  
                int result = 0;
                if (i.equals("+")) result = a + b;
                else if (i.equals("-")) result = a - b;
                else if (i.equals("*")) result = a * b;
                else result = a / b;
                stack.push(result);
            } else {
             stack.push(Integer.parseInt(i));   
            }
        }
        return stack.pop();

    }
}