package new_home_word_4;

public class Bill {
    private final double MONEY_1_ELECTRICITY = 700;
    private Customer customer;
    private int oldIndexElectric;
    private int newIndexElectric;

    public Bill() {

    }

    public Bill(Customer customer, int oldIndexElectric, int newIndexElectric) {
        this.customer = customer;
        this.oldIndexElectric = oldIndexElectric;
        this.newIndexElectric = newIndexElectric;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldIndexElectric() {
        return oldIndexElectric;
    }

    public void setOldIndexElectric(int oldIndexElectric) {
        this.oldIndexElectric = oldIndexElectric;
    }

    public int getNewIndexElectric() {
        return newIndexElectric;
    }

    public void setNewIndexElectric(int newIndexElectric) {
        this.newIndexElectric = newIndexElectric;
    }

    public double moneyElectricity() {
        return (newIndexElectric - oldIndexElectric) * MONEY_1_ELECTRICITY;
    }

    @Override
    public String toString() {
        return customer.toString() + " "
                + getOldIndexElectric() + " "
                + getNewIndexElectric();
    }
}
