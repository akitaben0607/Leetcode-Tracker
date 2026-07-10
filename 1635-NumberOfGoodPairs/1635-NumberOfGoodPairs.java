// Last updated: 7/10/2026, 11:54:37 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer>freq = new HashMap();
        int pairs=0;
        for(int x:nums){
            pairs+=freq.getOrDefault(x,0);
            freq.put(x,freq.getOrDefault(x,0)+1);
        }    
        return pairs;
    }
}