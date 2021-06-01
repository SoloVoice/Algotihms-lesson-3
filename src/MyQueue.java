public class MyQueue {
    private static final int HEAD_DEFAULT = 0;
    private static final int TAIL_DEFAULT = -1;
    private int[] arr;
    private int size = 0;
    private int head;
    private int tail;

    public MyQueue(int length) {
        this.arr = new int[length];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }

    public void push(int value) {
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

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Очередь пуста!");
            return false;
        } else {
            size--;
            if (head == arr.length-1) {
                head = HEAD_DEFAULT;
            }
            return arr[head++];
        }
    }

    public Object peak() {
        return arr[head];
    }

    private boolean isFull() {
        return size == arr.length;
    }
    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("[");
        // Вот тут я не справился. Я не придумал как вывести все элементы в консоль.
        // Если массив полностью заполнен и хвост с головой стоят рядом, то цикл не работает.
        // Я понимаю почему он не работает, не не могу придумать как сделать чтоб работал как нужно.
        for (int i = head; i!=tail+1; i++) {
            if (i == arr.length) {
                i=0;
            }
            sb.append(arr[i]);
            if (!(i == tail)) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
