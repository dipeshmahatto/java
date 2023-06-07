package lab.Assignment;

public class lab_9 {
    String name;
    int id;

    void setName(String n, int i) {
        name = n;
        id = i;
    }

    void getName() {
        System.out.println("Name " + name);
        System.out.println("ID :" + id);
    }

    public static void main(String[] args) {
        lab_9 l = new lab_9();
        l.setName("Dipesh",06);
        l.getName();
    }
}
