public class ThreadSyncProblem {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder("In general, inheritance means inheriting something from others. We inherit things from our parents like looks, height, wealth, property, luxury, etc. ");
        // One thread will delete another will append
        /*stringBuilder.delete(0,1);
        System.out.println(stringBuilder);
        stringBuilder.append("Aa ");
        System.out.println(stringBuilder);*/

        Runnable runnableDelete = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    modifier(stringBuilder, true);
                   /* try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }*/
                }
            }
        };

        Runnable runnableAppend = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    modifier(stringBuilder, false);
                    System.out.println("Append");

                    /*try {
                        //Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }*/
                }
            }
        };
        Thread threadDelete = new Thread(runnableDelete);
        Thread threadAppend = new Thread(runnableAppend);
        threadDelete.start();
        threadAppend.start();
        Thread.sleep(20000);
        System.out.println(stringBuilder);
    }

    public static StringBuilder modifier(StringBuilder  stringBuilder, boolean isDelete){
        if(isDelete){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return stringBuilder.delete(0,5);
        }else{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception");
            }
            return stringBuilder.append("hello");
        }
    }
}
