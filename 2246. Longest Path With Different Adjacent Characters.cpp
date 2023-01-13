class Solution {
public:
    int ans =INT_MIN;
    int solve(vector<vector<int>>&adj,int start, int parent, string &s){
        int mx1=0, mx2=0, temp; 
        for(auto x:adj[start]){
            temp= solve(adj, x, start, s);
            if(temp!=-1) {
                if(temp>=mx1) {
                   mx2=mx1;
                   mx1=temp;
                }
                else if(temp<mx1 && temp>mx2){
                   mx2=temp;
                }
            }
        }
        ans=max(ans, mx1+mx2+1); 
        if(parent==-1)
        return mx1+1;
        if(s[start]==s[parent]) return -1;
        else return mx1+1;
    }
    int longestPath(vector<int>& parent, string s) {
        int n=parent.size();
        vector<vector<int>>adj(n);
        for(int i=1;i<n;i++) {
            adj[parent[i]].push_back(i);
        }
        solve(adj, 0 ,-1,s);
        return ans;
    }
};
