class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjlist = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i =0; i<numCourses;i++){
            adjlist.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            adjlist.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int res = 0;

        for(int i =0; i<numCourses; i++){
            if(indegree[i] == 0) q.offer(i);
        }

        while(!q.isEmpty()){
            int cur = q.poll();
            res++;

            for(int next: adjlist.get(cur)){
                if(--indegree[next] ==0){
                    q.offer(next);
                }
            }
        }
        return res == numCourses;
        
    }
}