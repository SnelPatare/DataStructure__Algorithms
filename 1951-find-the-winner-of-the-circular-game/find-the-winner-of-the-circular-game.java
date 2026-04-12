class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i<=n ; i++){
            que.offer(i);
        }
        while(que.size()>1){
            for(int i =1; i <k; i++){
                que.offer(que.poll());
            }
            que.poll();
        }
        return que.peek();
    }
}