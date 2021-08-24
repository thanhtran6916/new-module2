public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        return "Không phải là tam giác";
    }
}
