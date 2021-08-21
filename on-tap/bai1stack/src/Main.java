public class Main {
    public static void main(String[] args) {
        Customer a = new Customer("thành", 25, "1");
        Customer b = new Customer("trần", 24, "3");
        Customer c = new Customer("văn", 23, "2");

        Hotel one = new Hotel(a, 2, 200);
        Hotel two = new Hotel(b, 4, 150);
        Hotel three = new Hotel(c, 3, 200);

        HotelManagement myHotel = new HotelManagement();
        myHotel.addHotel(one);
        myHotel.addHotel(two);
        myHotel.addHotel(three);

        myHotel.showAll();

        System.out.println("--------------");
        Customer d = new Customer("chiến", 30, "3");
        Hotel editHotel = new Hotel(d, 2, 150);
        myHotel.editHotel("3", editHotel);
    }


}
