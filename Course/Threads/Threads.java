class Multiple implements Runnable {
    int N;

    Multiple(int n) {
        N = n;
    }

    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % N == 0) {
                    System.out.println(i + " is a multiple of " + N);
                    Thread.sleep(1);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Multiple(2));
        Thread t2 = new Thread(new Multiple(3));
        t1.run();
        t2.run();
    }
}
