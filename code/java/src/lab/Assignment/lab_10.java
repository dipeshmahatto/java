package lab.Assignment;

class lab10 {
    void setAddress(){
        System.out.println("Setting address in parent class.");
    }
}

class lab_10 extends lab10 {
    void setAddress(){
        System.out.println("Setting address in child class.");
    }
}
class overriding {
    public static void main(String[] args) {
        lab10 l = new lab_10();
        l.setAddress();
    }
}
