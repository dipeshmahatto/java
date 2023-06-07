class Car2 extends Vechicle {
    int maxSpeed = 180;
    void  display()
    {
        System.out.println("Maximum Speed: "+ super.maxSpeed);
    }

    public static void main(String[] args) {
        Car2 c = new Car2();
        c.display();
    }
}
