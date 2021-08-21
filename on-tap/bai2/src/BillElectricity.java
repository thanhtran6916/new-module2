public class BillElectricity implements Comparable<BillElectricity> {
    private Customer customer;
    private int idBill;
    private int moneyPay;

    public BillElectricity(Customer customer, int idBill, int moneyPay) {
        this.customer = customer;
        this.idBill = idBill;
        this.moneyPay = moneyPay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public int getMoneyPay() {
        return moneyPay;
    }

    public void setMoneyPay(int moneyPay) {
        this.moneyPay = moneyPay;
    }

    @Override
    public String toString() {
        return "BillElectricity{" +
                "customer=" + customer +
                ", idBill=" + idBill +
                ", moneyPay=" + moneyPay +
                '}';
    }

    @Override
    public int compareTo(BillElectricity o) {
        return customer.getName().compareTo(o.getCustomer().getName());
    }
}
