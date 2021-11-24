public class Owner extends Person{

    private double netWorth;

    public Owner(String name, int age, Country country, double netWorth) {
        super(name, age, country);
        this.netWorth = netWorth;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

}

