package lesson5;
public class MainClass {
private static final int SIZE = 10000000;
    private static final int HALF = SIZE / 2;
    private static float[] arr = new float[SIZE];

    private static void OneThread(float[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long startTime = System.currentTimeMillis() - start;
        System.out.printf("Время выполнения одного потока: %d%n", startTime );
        System.out.println(arr[HALF]);
    }

        private static void TwoThread(float[] arr) {
        long start = System.currentTimeMillis();
        float[] a = new float[HALF];
        float[] b = new float[HALF];

        System.arraycopy(arr, 0, a, 0, HALF);
        System.arraycopy(arr, HALF, b, 0, HALF);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < a.length; i++) {
                a[i] = (float) (a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < b.length; i++) {
                b[i] = (float) (b[i] * Math.sin(0.2f + (i+HALF) / 5) * Math.cos(0.2f + (i+HALF) / 5) * Math.cos(0.4f + (i+HALF) / 2));
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a, 0, arr, 0, HALF);
        System.arraycopy(b, 0, arr, a.length, b.length);

        long multiTime = System.currentTimeMillis() - start;
        System.out.printf("Время выполнения многопоточчного: %d%n", multiTime);
        System.out.println(arr[HALF]);
    }
    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        OneThread(arr);
        TwoThread(arr);
    }
}
