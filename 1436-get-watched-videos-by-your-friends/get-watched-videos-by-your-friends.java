class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        int n = friends.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(id);
        visited[id] = true;

        while(level > 0){
            int size = q.size();
            for(int i =0; i < size; i++){
                int person = q.poll();
                for(int friend: friends[person]){
                    if(!visited[friend]){
                        q.offer(friend);
                        visited[friend] = true;
                    }
                }
            }
            level--;
        }
        Map<String, Integer> freq = new HashMap<>();
        for (int person:q){
            for(String video: watchedVideos.get(person)){
                freq.put(video, freq.getOrDefault(video,0)+1);
            }
        }

        List<String> res = new ArrayList<>(freq.keySet());
        res.sort((a,b) -> {
            if(freq.get(a).equals(freq.get(b))){
                return a.compareTo((b));
            }
            return freq.get(a) - freq.get(b);
        });
        return res;


    }
}