/**
 * Created by isvet on 15.03.17.
 */

import java.util.Random;

class SharedNumber {
    private int a;

    synchronized void write() {
        notify();
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        Random r = new Random();
        a = r.nextInt();
        System.out.println("Работает поток 1");
        System.out.println("Записали число " + a);
        notify();
    }

    synchronized void read() {
        notify();
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        System.out.println("Работает поток 2");
        System.out.println("Считали число " + a);
    }
}
