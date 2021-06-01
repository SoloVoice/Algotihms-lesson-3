public class MyStack {
    private Object[] arr;
    private int size = 0;

    public MyStack(int length) {
        arr = new Object[length];
    }

    public void push(Object value) {
        if (!isFull()) {
            arr[size++] = value;
        } else {
            System.out.println("Стек переолнен!");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            return arr[--size];
        } else {
            System.out.println("Стек пустой!");
            return null;
        }
    }

    public Object peak() {
        if (!isEmpty()) {
            return arr[size-1];
        } else {
            System.out.println("Стек пустой!");
            return null;
        }

    }

    private boolean isFull() {
        if (size == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i<size; i++) {
            sb.append(arr[i]);
            if (!(i == size-1)) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
