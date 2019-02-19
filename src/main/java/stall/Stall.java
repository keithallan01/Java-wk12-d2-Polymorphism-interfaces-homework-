package stall;

import attractions.IReviewed;

public abstract class Stall implements IReviewed {
    private String name;
    private String owner;
    private int parkingSpot;
    private int rating;

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

    public int getRating(){
        return rating;
    }
}
