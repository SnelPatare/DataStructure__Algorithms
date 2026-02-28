class Solution {
    List<List<Integer>> adjlist = new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for(int i =0; i<numCourses ; i++){
            adjlist.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];

        for(int[] p:prerequisites){
            adjlist.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int[] result = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0) q.offer(i);
        }

        int index = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            result[index++] = cur;

            for(int next:adjlist.get(cur)){
                if(--indegree[next] == 0){
                    q.offer(next);
                }
            }
        }
        return index == numCourses ? result : new int[0];

        
    }
}