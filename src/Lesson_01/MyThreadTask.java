package Lesson_01;

public class MyThreadTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread" + i);
            // Замедляем цикл, чтобы наглядней увидеть многопоточность
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
