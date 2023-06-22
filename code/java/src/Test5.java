public class Test5 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        Test5 test = new Test5();
        Thread t1 = new Thread(test,"First Thread");
        Thread t2 = new Thread(test,"Second Thread");
        Thread t3 = new Thread(test,"Third Thread");

        t1.setPriority(4);
        t2.setPriority(2);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();

//        Thread t = new Thread(test,"NewThread");
//        System.out.println("Priority of Thread:"+t.getPriority());
//        System.out.println("Name of Thread:"+t.getName());
//        t.start();.
    }
}
