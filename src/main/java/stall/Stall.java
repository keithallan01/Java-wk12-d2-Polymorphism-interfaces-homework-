package stall;

public abstract class Stall {
    private String name;
    private String owner;
    private int parkingSpot;

    public Stall(String name, String owner, int parkingSpot){
        this.name = name;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }
}
