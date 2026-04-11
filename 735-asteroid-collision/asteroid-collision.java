class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();
        

        for(int ast:asteroids){
            boolean flag = true;
            while(!st.isEmpty() && st.peek() >0 && ast <0){
                if(Math.abs(st.peek()) < Math.abs(ast)){
                    st.pop();
                    continue;
                }
                else if(Math.abs(st.peek()) == Math.abs(ast)){
                     st.pop();
                }
                flag = false;
                break;
            }
            if(flag){
                st.push(ast);
            }
        }

        int[] result = new int[st.size()];
        for(int i = result.length-1; i >= 0; i--){
            result[i] = st.peek();
            st.pop();
        }
        return result;
        
        
    }
}