package inheritance;

public class catFamily {
    protected int legs;
    protected int eyes;
    protected boolean eatPeople;

    public void eat () {
        System.out.print("Eat ");
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isEatPeople() {
        return eatPeople;
    }

    public catFamily(int legs, int eyes, boolean eatPeople) {
        this.legs = legs;
        this.eyes = eyes;
        this.eatPeople = eatPeople;
    }
}
