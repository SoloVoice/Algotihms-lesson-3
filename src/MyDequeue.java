public class MyDequeue {
    private static final int HEAD_DEFAULT = 0;
    private static final int TAIL_DEFAULT = 0;
    private int[] arr;
    private int size = 0;
    private int head;
    private int tail;

    public MyDequeue(int length) {
        this.arr = new int[length];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }

    public void pushHead(int value) {
        if (isFull()) {
            System.out.println("Очередь переполнена");
        } else {
            if (head < 0) {
                head = arr.length-1;
            }
            arr[head--] = value;
            size++;
        }
    }
    public void pushTail(int value) {
        if (isFull()) {
            System.out.println("Очередь переполнена");
        } else {
            if (tail == arr.length-1) {
                tail = TAIL_DEFAULT;
            }
            arr[++tail] = value;
            size++;
        }
    }

    public Object popTail() {
        if (isEmpty()) {
            System.out.println("Очередь пуста!");
            return false;
        } else {
            size--;
            if (tail == 0) {
                tail = arr.length;
            }
            return arr[--tail];
        }
    }
    public Object popHead() {
        if (isEmpty()) {
            System.out.println("Очередь пуста!");
            return false;
        } else {
            size--;
            if (head == arr.length-1) {
                head = TAIL_DEFAULT;
            }
            return arr[++head];
        }
    }

    public Object peakHead() {
        return arr[head];
    }

    public Object peakTail() {
        return arr[tail];
    }

    private boolean isFull() {
        return size == arr.length;
    }
    private boolean isEmpty() {
        return size == 0;
    }
}
