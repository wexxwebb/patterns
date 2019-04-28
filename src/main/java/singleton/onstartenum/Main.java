package singleton.onstartenum;

import singleton.lazy.LazyInitSingleton;

import java.util.concurrent.CountDownLatch;

import static singleton.onstartenum.Singleton.SINGLETON;

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
            System.out.println(start + ", " + SINGLETON.getUuid().toString());
        }
    }
}
