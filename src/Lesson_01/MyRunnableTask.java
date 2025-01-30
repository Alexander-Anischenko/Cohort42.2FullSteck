package Lesson_01;

public class MyRunnableTask  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread"+ Thread.currentThread().getName() + ": " + i);
            // Замедляем цикл, чтобы наглядней увидеть многопоточность
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
