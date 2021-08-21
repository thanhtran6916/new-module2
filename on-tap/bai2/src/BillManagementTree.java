import java.util.Set;
import java.util.TreeSet;

public class BillManagementTree {
    private Set<BillElectricity> billElectricitySet = new TreeSet<>();

    public Set<BillElectricity> getBillElectricitySet() {
        return billElectricitySet;
    }

    public void setBillElectricitySet(Set<BillElectricity> billElectricitySet) {
        this.billElectricitySet = billElectricitySet;
    }

    public void showBill() {
        for (BillElectricity bill : billElectricitySet) {
            System.out.println(bill);
        }
    }

    public void add(BillElectricity bill) {
        billElectricitySet.add(bill);
    }

    public BillElectricity searchBill(int id) {
        for (BillElectricity bill : billElectricitySet) {
            if (bill.getIdBill() == id) {
                return bill;
            }
        }
        return null;
    }

    public boolean deleteBill(int id) {
        BillElectricity deleteBill = searchBill(id);
        if (deleteBill == null) {
            return false;
        }
        billElectricitySet.remove(deleteBill);
        return true;
    }

    public boolean editBill(int id, BillElectricity newBill) {
        BillElectricity billEdit = searchBill(id);
        if (billEdit == null) {
            return false;
        }
        billElectricitySet.remove(billEdit);
        billElectricitySet.add(newBill);
        return true;
    }
}
