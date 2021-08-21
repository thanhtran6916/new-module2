import java.util.HashMap;
import java.util.Map;

public class HotelManagementMap {
    private Map<String, Hotel> hotelManagementMap = new HashMap<>();

    public Map<String, Hotel> getHotelManagementMap() {
        return hotelManagementMap;
    }

    public void setHotelManagementMap(Map<String, Hotel> hotelManagementMap) {
        this.hotelManagementMap = hotelManagementMap;
    }

    public void showAll() {
        for (Map.Entry<String, Hotel> hotelEntry : hotelManagementMap.entrySet()) {
            System.out.println(hotelEntry.getValue());
        }
    }

    public void add(Hotel hotel) {
        hotelManagementMap.put(hotel.getCustomer().getId(), hotel);
    }

    public boolean remove(String id) {
        if (search(id)) {
            hotelManagementMap.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public boolean search(String id) {
        if (hotelManagementMap.containsKey(id)) {
            return true;
        }
        return false;
    }

    public boolean edit(String id, Hotel hotel) {
        if (search(id)) {
            hotelManagementMap.replace(hotel.getCustomer().getId(), hotel);
            return true;
        }
        return false;
    }

}
