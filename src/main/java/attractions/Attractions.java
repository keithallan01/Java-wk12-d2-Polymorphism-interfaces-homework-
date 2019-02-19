package attractions;

import attractions.IReviewed;

public abstract class Attractions implements IReviewed{
    private String name;
    private int rating;

    public Attractions(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRating(){
        return rating;
    }
}
