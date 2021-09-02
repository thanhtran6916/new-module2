package ShapeFactory;

public class ShapeFactory {
    public ShapeFactory() {

    }

    public Shape getShape(String type) {
        switch (type) {
            case "hình vuông" :
                return new HinhVuong();
            case "hình tròn":
                return new Cricle();
            case "hình chữ nhật":
                return new Rectangle();
            default: return null;
        }
    }
}
