package Lesson_01;

public class Counter {
    private  int value;

    public int getValue() {
        return value;
    }
    public synchronized void increment() {
        value++;
    }

    public synchronized void dicrement() {
        value--;
    }
}


