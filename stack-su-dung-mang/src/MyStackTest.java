public class MyStackTest {
    public static void main(String[] args) {
        MyStack a = new MyStack(3);
        a.push(1);
        a.push(2);
        a.push(3);
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.display();

    }


}
