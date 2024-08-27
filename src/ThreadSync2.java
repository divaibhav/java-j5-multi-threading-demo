import java.util.Arrays;
import java.util.List;

public class ThreadSync2 {

    static List<Integer> list;
    public static void main(String[] args) {


         Runnable runnable = new Runnable() {
             @Override
             public void run() {

                     list.remove(1);

             }
         };
         Runnable runnable12 = new Runnable() {
             @Override
             public void run() {
                 list.add(1);
             }
         };
       

    }

}
