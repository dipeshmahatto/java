package lab.Assignment;

class Technology {
    void tech(){
        System.out.println("I am a technology class.");
    }
}
class phone extends Technology{
    void ph(){
        System.out.println("I am a phone class.");
    }
}
class smartPhone extends phone{
    void smp(){
        System.out.println("I am a smartphone class.");
    }
}
 class lab_13 extends smartPhone {
    public static void main(String[] args) {
        lab_13 l =new lab_13();
        l.tech();
        l.ph();
        l.smp();
    }
}
