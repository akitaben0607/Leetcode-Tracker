// Last updated: 7/10/2026, 11:53:38 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
      int tot=0;
      while(mainTank>=5){
        tot+=50;
        mainTank-=5;
        if (additionalTank >=1) {mainTank++; additionalTank--;}
      }
      return tot+(mainTank*10);
    }
}