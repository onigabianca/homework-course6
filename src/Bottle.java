public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean openStatus=true;

    public Bottle(int getCapacity, int getAvailableLiquid, boolean getOpenStatus) {
        totalCapacity = getCapacity;
        availableLiquid = getAvailableLiquid;
        openStatus = getOpenStatus;
    }

    public boolean moreLiquid(int givenLiquid) {
        if (givenLiquid > availableLiquid) {
            return true;
        } else return false;
    }

   public void setAvailableLiquid(int availableLiquid){
        this.availableLiquid=availableLiquid;
   }

   public int getAvailableLiquid(){
        return this.availableLiquid;
   }

   public int emptyCapacity(){
        return totalCapacity-availableLiquid;

   }



    public String toString() {
        return "My bottle has total capacity %s and available liquid %s and open status is %s.".formatted(this.totalCapacity, this.availableLiquid, this.openStatus);


    }
}
