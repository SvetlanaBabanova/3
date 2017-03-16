/**
 * Created by isvet on 15.03.17.
 */

public class Thread2 implements Runnable {
    private SharedNumber a;
    private int N;

    Thread2(SharedNumber a, int n) {
        this.a = a;
        N = n;
    }

    public void run() {
        for (int i = 0; i < N; ++i) {
            a.read();
        }
    }
}
