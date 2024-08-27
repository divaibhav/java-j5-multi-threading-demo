package threaddemo;

public class MyMain extends Thread {
    /* How to create a thread?
    BY extending Thread class
        -   Override the run method
    BY implementing Runnable
    BY declaring behaviour as Functional parameter
     */
    /*
    State - NEW, Runnable, Waiting, TimedWaiting , Blocked
     */
    @Override
     public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            // sleep for 1 sec
            // call sleep method of Thread class

        }
    }

    public static void main(String[] args) {
        Thread threadMyMain = new MyMain();
        threadMyMain.setPriority(Thread.MAX_PRIORITY);
        // how to execute this thread
        // by calling start method
        System.out.println("threadMyMain.getState() = " + threadMyMain.getState());

        System.out.println("threadMyMain.getState() = " + threadMyMain.getState());
        MyRunnable myRunnable = new MyRunnable();
        Thread threadMyRunnable = new Thread(myRunnable);
        threadMyRunnable.setPriority(Thread.MIN_PRIORITY);
        threadMyRunnable.start();
        threadMyMain.start();




    }
}
