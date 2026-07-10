// Last updated: 7/10/2026, 11:55:27 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int count1=0;
        int count2=0;
        for(int x: position){
            if (x%2==0) {
                count1++;
            }else{
                count2++;
            }
        }
        if (count1<count2) return count1;
        else return count2;
        
    }
}