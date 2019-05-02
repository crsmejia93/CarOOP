public class Car extends Vehicle {
    private String year;
    private String make;
    private String model;

    public Car(){}

    public Car(String year, String make, String model, String color){
        this.year=year;
        this.make=make;
        this.model=model;
        super.setColor(color);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
        System.out.println("The Speed is now "+speed+" mph");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void start(){
        System.out.printf("The %s %s is starting\n", this.getColor(), this.getModel());
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String accelerate(){
        return "The "+this.getColor()+" "+this.getModel()+" is accelerating";
    }

    public String emisionTest(){
        return "The "+this.getColor()+" "+this.getModel()+" has stopped to have its emissions checked.";
    }

    public String stop(){
        return "The car is stopping";
    }
    @Override
    public String toString(){
        return "Year: "+getYear()+"\nMake: "+getMake()+"\nModel: "+getModel()+"\nColor: "+getColor()+"\n";
    }

}
