public class Hogwarts {
    private String name;
    private int magic;
    private  int trangressionDistans;

    public Hogwarts(String name, int magic, int trangressionDistans) {
        this.name = name;
        this.magic = magic;
        this.trangressionDistans = trangressionDistans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTrangressionDistans() {
        return trangressionDistans;
    }

    public void setTrangressionDistans(int trangressionDistans) {
        this.trangressionDistans = trangressionDistans;
    }

    private int sum() {
        return magic + trangressionDistans;
    }
    public void compare(Hogwarts other) {
        if (sum() > other.sum()){
            System.out.println(name + " обладает большей магией чем "+ other.name);
        }else {
            System.out.println(other.name + " обладает большей магией чем "+ name);
        }
    }
    @Override
    public String toString() {
        return name + " : " +
                " magic=" + magic +
                ", trangressionDistans=" + trangressionDistans;
    }
}
