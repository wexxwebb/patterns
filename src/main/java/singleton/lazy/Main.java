package singleton.lazy;

import java.util.concurrent.CountDownLatch;

public class Main {

    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SingletonGetter());
            thread.start();
        }
        countDownLatch.countDown();
    }

    private static class SingletonGetter implements Runnable {

        @Override
        public void run() {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long start = System.currentTimeMillis();
            LazyInitSingleton lazyInitSingleton = LazyInitSingleton.getInstance();
            System.out.println(start + ", " + lazyInitSingleton.getUuid().toString());
        }
    }
}
