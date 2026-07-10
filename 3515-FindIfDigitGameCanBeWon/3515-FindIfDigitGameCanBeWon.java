// Last updated: 7/10/2026, 11:53:14 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
    int singlecount=0;
    int doublecount=0;
    int total=0;
        for(int num:nums){
            total+=num;
            if(num<10){
                singlecount+=num;
            }else{
                doublecount+=num;
            } 
        }
        if(singlecount>(total-singlecount) || doublecount>(total-doublecount)) return true;
        else return false;
    }
}