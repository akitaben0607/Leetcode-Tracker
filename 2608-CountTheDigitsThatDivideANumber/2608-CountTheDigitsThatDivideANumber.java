// Last updated: 7/10/2026, 11:54:03 AM
class Solution {
    public int countDigits(int num) {
        int last,count=0;
        int ori=num;
        while(num!=0){
            last=num%10;
            if (ori%last==0){
                count++;
            } 
            num=num/10;
        }
        return count;
    }
}