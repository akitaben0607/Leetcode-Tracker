// Last updated: 7/10/2026, 11:54:23 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num%10!=0){
            return true;
        }else if(num==0){
            return true;
        }else{
            return false;
        }
        
    }
}