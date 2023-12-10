public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefullnts;
    private int lastOfPower;

    public Slytherin(String name,
                     int magic,
                     int trangressionDistans,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefullnts,
                     int lastOfPower) {
        super(name, magic, trangressionDistans);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefullnts = resourcefullnts;
        this.lastOfPower = lastOfPower;

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefullnts() {
        return resourcefullnts;
    }

    public void setResourcefullnts(int resourcefullnts) {
        this.resourcefullnts = resourcefullnts;
    }

    public int getLastOfPower() {
        return lastOfPower;
    }

    public void setLastOfPower(int lastOfPower) {
        this.lastOfPower = lastOfPower;
    }

    private int sum() {
        return cunning+ determination + ambition + resourcefullnts+ lastOfPower;

    }

    public void compare(Slytherin other) {
        int thisPower = sum();
        int otherPower = other.sum();
        if (thisPower > otherPower) {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());

        }
    }
    @Override
    public String toString() {
        return "Slytherin. " + super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefullnts=" + resourcefullnts +
                ", lastOfPower=" + lastOfPower;
    }
}
