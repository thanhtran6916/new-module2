package CAR;

abstract class Mazda {
    private final double TAX = 0.1;
    private String name;
    private int cost;
    private String fuel;
    private int seat;
    private String design;
    private String origin;

    public Mazda() {

    }

    public Mazda(String name, int cost, String fuel, int seat, String design, String origin) {
        this.name = name;
        this.cost = cost;
        this.fuel = fuel;
        this.seat = seat;
        this.design = design;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double readCost() {
        return cost + cost * TAX;
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", fuel='" + fuel + '\'' +
                ", seat=" + seat +
                ", design='" + design + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
