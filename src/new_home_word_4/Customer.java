package new_home_word_4;

class Customer {
    private String name;
    private String address;
    private String idElectric;

    Customer() {

    }

    Customer(String name, String address, String idElectric) {
        this.name = name;
        this.address = address;
        this.idElectric = idElectric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdElectric() {
        return idElectric;
    }

    public void setIdElectric(String idElectric) {
        this.idElectric = idElectric;
    }

    @Override
    public String toString() {
        return "{" + name + " , "
                + address + " , "
                + idElectric + "}";
    }
}
