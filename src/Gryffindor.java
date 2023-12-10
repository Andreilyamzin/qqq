public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public Gryffindor(String name, int magic, int trangressionDistans, int nobility, int honor, int courage) {
        super(name, magic, trangressionDistans);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    private int sum() {
        return getCourage() + getHonor() + getNobility();
    }

    public void compare(Gryffindor other) {
        int thisPower = sum();
        int otherPower = other.sum();
        if (thisPower > otherPower) {
            System.out.println(getName() + " лучший Гриффендорец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Гриффендорец, чем " + getName());

        }
    }




    @Override
    public String toString() {
        return "Gryffindor. " + super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }
}
