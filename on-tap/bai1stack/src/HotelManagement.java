import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class HotelManagement {
    private List<Hotel> hotels = new Stack<>();

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void showAll() {
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public void deleteHotel(String id) {
        List<Hotel> temp = new LinkedList<Hotel>(hotels);
        Hotel deleteHotel = null;
        for (Hotel hotel : temp) {
            if (hotel.getCustomer().getId().equals(id)) {
                deleteHotel = hotel;
                break;
            }
        }
        temp.remove(deleteHotel);
        hotels.clear();
        for (Hotel hotel : temp) {
            hotels.add(hotel);
        }
    }

    public Hotel searchHotel(String id) {
        List<Hotel> temp = new LinkedList<>(hotels);
        Hotel search = null;
        for (Hotel hotel : temp) {
            if (hotel.getCustomer().getId().equals(id)) {
                search = hotel;
                break;
            }
        }
        return search;
    }

    public void editHotel(String id, Hotel hotel) {
        Hotel editHotel = searchHotel(id);
        if (editHotel != null) {
            List<Hotel> temp = new LinkedList<>(hotels);
            temp.remove(editHotel);
            temp.add(hotel);
            hotels.clear();
            for (Hotel hotel1 : temp) {
                hotels.add(hotel1);
            }
        }
        showAll();
    }

}
