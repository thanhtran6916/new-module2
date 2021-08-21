public class HotelManagementMapTest {
    public static void main(String[] args) {
        Customer a = new Customer("thành", 25, "1");
        Customer b = new Customer("trần", 24, "3");
        Customer c = new Customer("văn", 23, "2");

        Hotel one = new Hotel(a, 2, 200);
        Hotel two = new Hotel(b, 4, 150);
        Hotel three = new Hotel(c, 3, 200);

        Customer d = new Customer("Chiến", 31, "2");
        Hotel four = new Hotel(d, 2, 200);


        HotelManagementMap hotelMap = new HotelManagementMap();
        hotelMap.add(one);
        hotelMap.add(two);
        hotelMap.add(three);


        hotelMap.edit("2", four);
        hotelMap.showAll();

    }

}
