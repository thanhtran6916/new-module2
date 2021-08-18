import java.util.EmptyStackException;

public class MyStack {
    private int[] arr;
    private int size;
    private int index;
    private int last;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
        index = 0;
    }

    public boolean isEmpty() {
        boolean flag = false;
        if (index == 0) {
            flag = true;
        }
        return flag;
    }

    public boolean isFull() {
        boolean flag = false;
        if (index == size) {
            flag = true;
        }
        return flag;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[index] = value;
        last = arr[index];
        index++;

    }

    public int pop() {
        int result;
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        result = arr[index - 1];
        index--;
        return result;
    }

    public void display() {
        if (index == 0) {
            System.out.println("Mảng đang trống");
            return;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }

}
