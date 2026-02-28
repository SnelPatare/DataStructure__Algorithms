class Solution {
    int[] state;
    List<List<Integer>> adjlist;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adjlist = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adjlist.add(new ArrayList<>());
        }

        for(int[] p:prerequisites){
            adjlist.get(p[1]).add(p[0]);
        }
        state = new int[numCourses];

        for(int i=0; i<numCourses; i++){
            if(state[i] == 0){
                if(dfs(i)) return false;
            }
        }

    return true;
        
    }

    private boolean dfs(int course){
        if(state[course] == 1) return true;
        if(state[course] == 2) return false;

        state[course] = 1;
        for(int i : adjlist.get(course)){
            if(dfs(i)) return true;
        }
        state[course] = 2;
        return false;
    }
}