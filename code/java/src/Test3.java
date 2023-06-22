public class Test3 implements Runnable{
    public static void main(String[] args) {
        Test3 obj = new Test3();
        Thread thread  = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
