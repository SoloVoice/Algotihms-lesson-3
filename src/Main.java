import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Стек
//        MyStack myStack = new MyStack(10);

        //Очередь
//        MyQueue myQueue = new MyQueue(10);

        //Двусторонняя очередь
//        MyDequeue myDequeue = new MyDequeue(10);

        //Разворачиваем строку
        String str = "Цена нефти Brent превысила $71 за баррель впервые с восьмого марта";
        MyStack stack = new MyStack(str.length());
        char[] strArr = str.toCharArray();
        for (char c: strArr) {
            stack.push(c);
        }
        for (int i = 0; i<strArr.length; i++) {
            System.out.print(stack.pop());
        }
    }
}
