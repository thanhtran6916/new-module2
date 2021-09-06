package trienKhaiProxy;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy mathCalculatorProxy = new MathCalculatorProxy();
        double result = mathCalculatorProxy.add(1,2);
        System.out.println(result);
        result = mathCalculatorProxy.div(1, 0);
        System.out.println(result);
    }
}
