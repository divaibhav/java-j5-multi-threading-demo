public class TaskThread {
    public static void main(String[] args) {
        Runnable runnableTask1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        };

        Runnable runnableTask2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i >= 1 ; i--) {
                    if(i % 2 != 0){
                        System.out.println(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnableTask1);
        Thread thread2 = new Thread(runnableTask2);
        thread1.start();
        thread2.start();
    }
}
