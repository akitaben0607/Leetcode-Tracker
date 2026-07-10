// Last updated: 7/10/2026, 11:54:35 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange)
        {
            int newd=empty/numExchange;
            empty=(empty%numExchange)+newd;
            drink+=newd;
        }
        return drink;
    }
}