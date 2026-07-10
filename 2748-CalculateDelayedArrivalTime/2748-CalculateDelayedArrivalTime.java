// Last updated: 7/10/2026, 11:53:51 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       if(arrivalTime+delayedTime<=23) return arrivalTime+delayedTime;
       else return (arrivalTime+delayedTime)%24;
    }
}