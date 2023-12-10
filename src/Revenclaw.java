public class Revenclaw  extends Hogwarts{
    private int wisdom;
    private int wis;
    private int creativity;

    public Revenclaw(String name, int magic, int trangressionDistans, int wisdom, int wis, int creativity) {
        super(name, magic, trangressionDistans);
        this.wisdom = wisdom;
        this.wis = wis;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int sum() {
        return wisdom + wis + creativity;

    }

    public void compare(Revenclaw other) {
        int thisPower = sum();
        int otherPower = other.sum();
        if (thisPower > otherPower) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());

        }
    }

    @Override
    public String toString() {
        return "Revenclaw. "+ super.toString() +
                ", wisdom=" + wisdom +
                ", wis=" + wis +
                ", creativity=" + creativity;
    }
}
