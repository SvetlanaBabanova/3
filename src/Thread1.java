/**
 * Created by isvet on 15.03.17.
 */

public class Thread1 implements Runnable {
    private SharedNumber a;
    private int N;

    Thread1(SharedNumber a, int n) {
        this.a = a;
        N = n;
    }

    public void run() {
        for (int i = 0; i < N; ++i) {
            a.write();
        }
    }
}
