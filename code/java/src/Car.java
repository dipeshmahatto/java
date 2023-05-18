class Car {
    String name = "hyundai i10";
    String model = "2019v";
    int price = 200000;

    public  void Start(){
        System.out.println("start");
    }
    public void  Stop (){
        System.out.println("Stop");
    }
    public void  turnleft (){
        System.out.println("Turn left");
    } public void  turnright (){
        System.out.println("Turn right");
    }

    public static void main(String[] args) {
        Car carobject = new Car();
        carobject.Start();
        carobject.Stop();
        carobject.turnleft();
        carobject.turnright();
//        System.out.println("Santosh Deewaana ###");

    }

}