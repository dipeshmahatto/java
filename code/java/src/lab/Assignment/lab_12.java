package lab.Assignment;

interface Car2 {
     void On();
}

interface Bike {
     void Horn();
}

public class lab_12 implements Bike, Car2 {
    public void On() {
        System.out.println("starting car.");
    }
    public void Horn() {
        System.out.println("starting Bike with popo popo.");
    }
    public static void main(String[] args) {
        lab_12 l = new lab_12();
        l.Horn();
        l.On();
    }
}
