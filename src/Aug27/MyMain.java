/**
 * Author: Vaibhav Diwan
 * User: Vaibhav Diwan
 * Date: 8/27/2024
 * Time: 6:21 PM
 */
package Aug27;

public class MyMain {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread1 = new MyThread1();
        //creating Runnable reference for passing it to thread, as a target of run method
        MyRunnable runnable = new MyRunnable();

        Thread thread2 = new Thread(runnable);

        // we can set the priority of Thread
        // priority can be any numeric value between 0 and 10
        // min max, normal 1, 10, 5
        // by default all threads have normal priority
        // to set the priority use setPriority method of thread class
        myThread1.setPriority(Thread.MIN_PRIORITY);
        // Always set priority by using the Named constant of Thread class
        thread2.setPriority(10);
        System.out.println(thread2.getState());
        System.out.println(myThread1.getState());

        // start the thread execution
        myThread1.start();
        thread2.start();
        while(thread2.isAlive()) {
            System.out.println(thread2.getState());
            System.out.println(myThread1.getState());
            Thread.sleep(5000);
        }
    }
}
