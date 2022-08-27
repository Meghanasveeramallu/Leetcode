class Solution {
    public String[] findRelativeRanks(int[] score) {
        int l = score.length;
        String[] ans = new String[l];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(Integer k : score) pq.add(k);
        int r = 1;
        Map<Integer,String> hm = new HashMap<Integer,String>();
        while(!pq.isEmpty()){
            String t = String.valueOf(r);
            if(r==1) 
                t = "Gold Medal";
            else if(r==2)
                t = "Silver Medal";
            else if(r==3)
                t = "Bronze Medal";
            hm.put(pq.remove(),t);
            r++;
        }
        for(int i=0;i<l;i++){
            ans[i] = hm.get(score[i]);
        }
        return ans;
    }
}

