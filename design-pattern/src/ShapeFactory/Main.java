package ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("hình vuông");
        System.out.println(shape1.draw());

        Shape shape2 = shapeFactory.getShape("hình tròn");
        System.out.println(shape2.draw());

        Shape shape3 = shapeFactory.getShape("hình chữ nhật");
        System.out.println(shape3.draw());
    }
}
