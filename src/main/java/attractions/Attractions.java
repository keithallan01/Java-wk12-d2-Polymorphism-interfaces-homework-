package attractions;

public abstract class Attractions {
    private String name;

    public Attractions(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
