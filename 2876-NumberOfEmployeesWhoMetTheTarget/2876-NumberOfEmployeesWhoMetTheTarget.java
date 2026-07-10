// Last updated: 7/10/2026, 11:53:36 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0; i<hours.length; i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }
}