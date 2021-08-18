public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int size = 0;

    public MyQueue(int number) {
        this.capacity = number;
        this.queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean result = false;
        if (size == capacity) {
            result = true;
        }
        return result;
    }

    public boolean isQueueEmpty() {
        boolean result = false;
        if (size == 0) {
            result = true;
        }
        return result;
    }

    public void enqueue(int value) {
        if (isQueueFull()) {
            throw new ArrayIndexOutOfBoundsException("Overflow");
        } else {
            queueArr[size] = value;
            size++;
        }
    }

    public int dequeue() {
        if (isQueueEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Empty!");
        } else {
            int result = queueArr[0];
            int[] newQueueArr = new int[queueArr.length];
            for (int i = 0; i < newQueueArr.length; i++) {
                if (i == newQueueArr.length - 1) {
                    newQueueArr[i] = 0;
                    break;
                }
                newQueueArr[i] = queueArr[i + 1];
            }
            queueArr = newQueueArr;
            return result;
        }
    }

    public int[] getQueueArr() {
        return queueArr;
    }
}
