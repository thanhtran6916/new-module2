package Max_Min_priority;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator("number1");
        NumberGenerator generator2 = new NumberGenerator("number2");
        SubNumberGenerator generatorSub = new SubNumberGenerator("number3");
        generator1.setPriority(Thread.MIN_PRIORITY);
        generator2.setPriority(Thread.MAX_PRIORITY);
        generator1.start();
        generator2.start();
        generatorSub.start();
    }

}
