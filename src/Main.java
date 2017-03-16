/**
 * Created by isvet on 15.03.17.
 */

public class Main {
    public static void main(String[] args) {
        int N = 0;
        try {
            N = Integer.parseInt(args[0]);
        } catch (Exception ignored) {
        }
        SharedNumber shNumb = new SharedNumber();
        Thread1 th1 = new Thread1(shNumb, N);
        Thread2 th2 = new Thread2(shNumb, N);
        new Thread(th1).start();
        new Thread(th2).start();
    }

}
