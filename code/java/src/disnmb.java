public class disnmb implements Runnable {
    @Override
    public void run(){
        System.out.println("child thread is");
        for(int i=0;i<18;i++){
            System.out.println("child "+i);
        }
        System.out.println(" >>>>>>>>>>>");
    }
}