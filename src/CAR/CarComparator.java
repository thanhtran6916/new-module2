package CAR;

import java.util.Comparator;

class CarComparator implements Comparator<Mazda> {

    @Override
    public int compare(Mazda o1, Mazda o2) {
        if (o1.getCost() > o2.getCost()) {
            return 1;
        }
        return -1;
    }
}
