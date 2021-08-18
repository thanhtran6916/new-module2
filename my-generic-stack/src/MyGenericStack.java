import java.util.*;

public class MyGenericStack<T> {

    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T t) {
        stack.add(t);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public boolean isEmpty() {
        PriorityQueue<Integer> a = new PriorityQueue<>();

        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return stack.size();
    }

}
