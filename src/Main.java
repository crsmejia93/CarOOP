public class Main {

    public static void main(String[] args){
        Car c1 = new Car();
        c1.setColor("Red");
        c1.setModel("911");
        c1.start();
        print(c1.accelerate());
        c1.setSpeed(60);
        print(c1.emisionTest());
        print(c1.stop());

        System.out.println();

        Car c2 = new Car();
        c2.setColor("Gray");
        c2.setModel("Civic");
        c2.start();
        print(c2.accelerate());
        c2.setSpeed(60);
        print(c1.stop());
    }

    private static void print(String s){
        System.out.println(s);
    }
}
