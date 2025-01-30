public class UseRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new  MyRunnableTask()); //new MyThreadTask();
        Thread thread2 = new Thread(new  MyRunnableTask()); //new MyThreadTask();
        thread1.setName("T1");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.setName("T2");
        thread1.start();
        thread1.join();
        //thread2.start();
        //thread2.join();
        System.out.println(Thread.currentThread().getName() + ": END.");
    }
}
