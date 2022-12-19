class Solution {
public:
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
        unordered_map<int, vector<int>> hash;
        for(auto& edge : edges){
            hash[edge[0]].push_back(edge[1]);
            hash[edge[1]].push_back(edge[0]);
        }
        queue<int> q;
        q.push(source);
        vector<bool> visit(n, false);
        while(!q.empty()){
            int cur = q.front();
            q.pop();
            if(cur == destination) return true;
            for(auto& node : hash[cur]){
                if(!visit[node]){
                    q.push(node);
                    visit[node] = true;
                }
            }
        }
        return false;
    }
};
