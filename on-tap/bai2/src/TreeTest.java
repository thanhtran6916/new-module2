public class TreeTest {
    public static void main(String[] args) {
        Customer a = new Customer("Trần Văn Thành", "tb", 25);
        Customer b = new Customer("van", "hn", 24);
        Customer c = new Customer("tran", "hn", 25);

        BillElectricity one = new BillElectricity(a, 1, 12);
        BillElectricity two = new BillElectricity(b, 2, 13);
        BillElectricity three = new BillElectricity(c, 3, 14);

        BillManagementTree myBill = new BillManagementTree();
        myBill.add(one);
        myBill.add(two);
        myBill.add(three);


        Customer d = new Customer("Trần Văn Chiến", "tb", 31);
        BillElectricity four = new BillElectricity(d, 1, 12);

        myBill.editBill(2, four);
        myBill.showBill();

    }


}
