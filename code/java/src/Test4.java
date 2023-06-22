public abstract class Test4 implements Runnable {
    public static void main(String[] args) {
        disnmb dn = new disnmb();
        Thread thread = new Thread(dn);
        thread.start();
        System.out.println("main thread");
        for (int i = 0; i < 15; i++) {
            System.out.println("main" + Thread.currentThread().getName() + " " + i);
        }
        System.out.println("main thread ends");
    }
}