public class ThreadDemo {
    public static void main(String[] args) {
        
       MyRunnable myRunnable = new MyRunnable();
       Thread thread1 = new Thread(myRunnable);
       //start this thread
        thread1.start();

        System.out.println("main thread");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from runnable, thread 2");
            }
        };

        Thread thread2 = new Thread(runnable);
        thread2.start();




    }
}
