public class TestMyGenericStack {
    public static void main(String[] args) {
        MyGenericStack<String> myStack = new MyGenericStack<>();
        myStack.push("Thanh");
        myStack.push("Tran");
        System.out.println(myStack.size());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        System.out.println(myStack.size());
    }

}
