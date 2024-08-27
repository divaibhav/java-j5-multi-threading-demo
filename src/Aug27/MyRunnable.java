/**
 * Author: Vaibhav Diwan
 * User: Vaibhav Diwan
 * Date: 8/27/2024
 * Time: 6:19 PM
 */
package Aug27;

import javax.swing.*;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 10; i >= 1 ; i--) {
            if(i % 2 != 0){
                System.out.println("My Runnable");
                System.out.println(i);
                JOptionPane.showInputDialog("Hello");
            }

        }

    }
}
