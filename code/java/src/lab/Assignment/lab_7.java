package lab.Assignment;

class sum {
    void Sum() {
        System.out.println("I am a class called by using object.");
    }
}

public class lab_7 {
    public static void main(String[] args) {
        sum s = new sum();
        s.Sum();
    }
}
