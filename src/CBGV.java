public class CBGV extends CanBo {
    private double salary;
    private double bonus;
    private double monetaryFine;
    private double receiveMoney;

    public CBGV(String name, String dateOfBirth, String address, double salary, double bonus, double monetaryFine) {
        super(name, dateOfBirth, address);
        this.salary = salary;
        this.bonus = bonus;
        this.monetaryFine = monetaryFine;
        this.receiveMoney = this.salary+this.bonus-this.monetaryFine;

    }

    public CBGV() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "CBGV{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", monetaryFine=" + monetaryFine +
                ", receiveMoney=" + receiveMoney +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getMonetaryFine() {
        return monetaryFine;
    }

    public void setMonetaryFine(double monetaryFine) {
        this.monetaryFine = monetaryFine;
    }

    public double getReceiveMoney() {
        return receiveMoney;
    }

    public void setReceiveMoney(double receiveMoney) {
        this.receiveMoney = receiveMoney;
    }
}
