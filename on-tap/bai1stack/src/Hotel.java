public class Hotel {
    private Customer customer;
    private int day;
    private double roomRates;

    public Hotel(Customer customer, int day, double roomRates) {
        this.customer = customer;
        this.day = day;
        this.roomRates = roomRates;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(double roomRates) {
        this.roomRates = roomRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "customer=" + customer +
                ", day=" + day +
                ", roomRates=" + roomRates +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Hotel) {
            Hotel another = (Hotel) obj;
            if (this.customer.getId().equals(another.customer.getId())) {
                return true;
            }
        }
        return false;

    }
}
