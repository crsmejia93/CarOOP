import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        boolean quit = false;
        Scanner input = new Scanner(System.in);
        String carInfo;
        String[] carInfoArr;
        ArrayList<Car> carList = new ArrayList<>();
        while(!quit){
            System.out.print("Enter car information(year, make, model, color) or (q-quit): ");
            carInfo = input.nextLine();
            if(carInfo.equalsIgnoreCase("q")){
                quit=true;
            }
            if(!carInfo.equalsIgnoreCase("q")){
                carInfoArr = carInfo.split(", ");
                carList.add( new Car(carInfoArr[0], carInfoArr[1],carInfoArr[2],carInfoArr[3]));
            }
        }
        int i=1;
        System.out.println("List of Cars");
        for(Car car: carList){
            System.out.println("Car " + i++);
            System.out.println(car.toString());
        }
    }

    private static void print(String s){
        System.out.println(s);
    }
}
