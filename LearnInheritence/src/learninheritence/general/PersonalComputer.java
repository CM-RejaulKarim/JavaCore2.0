
package learninheritence.general;


public class PersonalComputer {
  
    private boolean grocery;
    private String vegatables;
    private boolean packet;
    private boolean loose;

    public PersonalComputer() {
    }

    public PersonalComputer(boolean grocery, String greenVegatables, boolean packet, boolean loose) {
        this.grocery = grocery;
        this.vegatables = greenVegatables;
        this.packet = packet;
        this.loose = loose;
    }

    public boolean isGrocery() {
        return grocery;
    }

    public void setGrocery(boolean grocery) {
        this.grocery = grocery;
    }

    public String getGreenVegatables() {
        return vegatables;
    }

    public void setGreenVegatables(String greenVegatables) {
        this.vegatables = greenVegatables;
    }

    public boolean isPacket() {
        return packet;
    }

    public void setPacket(boolean packet) {
        this.packet = packet;
    }

    public boolean isLoose() {
        return loose;
    }

    public void setLoose(boolean loose) {
        this.loose = loose;
    }

    @Override
    public String toString() {
        return "Shop{" + "grocery=" + grocery + ", vegatables=" + vegatables + ", packet=" + packet + ", loose=" + loose + '}';
    }
    
    
}
