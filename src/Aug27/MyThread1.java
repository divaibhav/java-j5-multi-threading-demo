/**
 * Author: Vaibhav Diwan
 * User: Vaibhav Diwan
 * Date: 8/27/2024
 * Time: 5:44 PM
 */
package Aug27;
//Create two threads t1 & t2, t1 will print all the even numbers from 0 to 100 and t2 will print all the odd numbers from 100 to 0. Both threads will goto sleep for 1 sec after printing one number.
//extending
public class MyThread1 extends Thread {
    // override run method, to define my task that need to perform when Thread is running
    @Override
    public void run(){
        for (int i = 0; i <= 1000; i++) {

            if(i % 2 == 0){
                System.out.println("My Thread");
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
