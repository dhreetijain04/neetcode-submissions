class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>  stack = new Stack<>();
        int[] results= new int[temperatures.length];
        int diff=0;

        
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                diff= i-stack.peek();
                int popped=stack.pop();
                results[popped]=diff;
            }
            stack.push(i);
        } 
        return results;
    }
}
