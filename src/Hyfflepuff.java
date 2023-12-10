public class Hyfflepuff extends Hogwarts{
    private int industriosness;
    private int loyalty;
    private int hontst;

    public Hyfflepuff(String name,
                      int magic,
                      int trangressionDistans,
                      int industriosness,
                      int loyalty,
                      int hontst) {
        super(name, magic, trangressionDistans);
        this.industriosness = industriosness;
        this.loyalty = loyalty;
        this.hontst = hontst;
    }

    public int getIndustriosness() {
        return industriosness;
    }

    public void setIndustriosness(int industriosness) {
        this.industriosness = industriosness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHontst() {
        return hontst;
    }

    public void setHontst(int hontst) {
        this.hontst = hontst;
    }

    private int sum() {
        return industriosness + loyalty + hontst;

    }

    public void compare(Hyfflepuff other) {
        int thisPower = sum();
        int otherPower = other.sum();
        if (thisPower > otherPower) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());

        }
    }
    @Override
    public String toString() {
        return "Hyfflepuff. " + super.toString()+
                ", industriosness=" + industriosness +
                ", loyalty=" + loyalty +
                ", hontst=" + hontst ;
    }
}
